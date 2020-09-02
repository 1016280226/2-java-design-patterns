package com.dynamic.proxy;

import com.dynamic.service.OrderDynamicService;
import com.dynamic.service.OrderDynamicServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Created by Calvin on 2019/5/22
 * 动态代理：自动创建代理类 -> 一种通过 Java 反射机制实现的 -> jdk通过接口实现代理
 *                          -> 另外一种通过ASM 字节码技术实现的 -> ASM 底层是通过继承实现的代理
 */

/**
 * 使用JDK动态代理 -> 需要实现InvocationHandler 接口
 */
public class JdkInvocationHandler implements InvocationHandler  {

    /** 被代理类 (真实访问的对象)**/
    private Object target;

    public JdkInvocationHandler(Object target){
        this.target = target;
    };

    /**
     * @param proxy  代理类
     * @param method 目标方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("打印订单日志开始......");
        // 使用java 的反射技术执行
        Object invoke = method.invoke(target, args);
        System.out.println("打印订单日志结束......");
        return invoke;
    }

    public <T> T getProxy(){
        /**
         * 第一个参数：目标对象加载类，
         * 第二个参数: 目标对象实现的接口（被代理（房东、车主....））具体实现类
         */
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),  this);
    }

    public static void main(String[] args) {
        OrderDynamicService orderDynamicService = new JdkInvocationHandler(new OrderDynamicServiceImpl()).getProxy();
        orderDynamicService.order();
    }
}
