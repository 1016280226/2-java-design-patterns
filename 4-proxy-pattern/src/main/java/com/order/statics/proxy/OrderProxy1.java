package com.order.statics.proxy;

import com.order.statics.service.OrderService;

/**
 * description: 代理类角色, 使用了接口方式
 * date: 2020/9/14 22:57
 * author: Calvin
 * version: 1.0
 */
public class OrderProxy1 implements OrderService {

    /**
     * 代理对象 （目标对象）
     */
    private OrderService proxied;

    /**
     * 有参构造函数，设置赋值莫表对象
     * @param orderService
     */
    public OrderProxy1(OrderService orderService) {
        this.proxied=orderService;
    }

    @Override
    public void order() {
        System.out.println("静态代理-通过实现接口方式-日志收集开始...");
        proxied.order();
        System.out.println("静态代理-通过实现接口方式-日志收集结束...");
    }

}
