package com.order.statics.controller;

import com.order.statics.proxy.OrderProxy1;
import com.order.statics.proxy.OrderProxy2;
import com.order.statics.service.OrderService;
import com.order.statics.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: OrderController
 * date: 2020/9/14 23:07
 * author: Calvin
 * version: 1.0
 */
@RestController(value = "order1")
@RequestMapping("order/statics")
public class OrderController {

    @GetMapping("")
    public String order(){
        // 静态代理：通过接口方式
        OrderService orderService1 = new OrderProxy1(new OrderServiceImpl());
        orderService1.order();
        // 静态代理：通过继承方式
        OrderService orderService2 = new OrderProxy2();
        orderService2.order();
        return "下单成功";
    }

}
