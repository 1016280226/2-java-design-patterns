package com.order.dynamic.controller;

import com.order.dynamic.handler.JdkInvocationHandler;
import com.order.dynamic.intercept.CglibMethodInterceptor;
import com.order.dynamic.service.OrderService;
import com.order.dynamic.service.impl.OrderServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.cglib.core.DebuggingClassWriter.DEBUG_LOCATION_PROPERTY;

/**
 * description: OrderController
 * date: 2020/9/14 23:07
 * author: Calvin
 * version: 1.0
 */
@RestController(value = "order2")
@RequestMapping("order/dynamic")
public class OrderController {

    @GetMapping("jdk")
    public String order1(){
        // JDK调用处理器 -> 实现代理类
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        // 获取代理对象
        OrderService orderService = jdkInvocationHandler.getProxy();
        orderService.order();
        return "下单成功";
    }

    @GetMapping("cglib")
    public String order2(){
        System.setProperty(DEBUG_LOCATION_PROPERTY, "G:\\workspace\\github\\design-patterns\\5-proxy-desgin-patterns\\src\\main\\java\\com\\order\\dynamic\\proxy");
        // Cglib 方法拦截器
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置代理类的付类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调对象G:\workspace\github\java\2-java-design-patterns\4-proxy-pattern\src\main\java\com\order\dynamic\proxy
        enhancer.setCallback(cglibMethodInterceptor);
        // 创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();
        return "下单成功";
    }

}
