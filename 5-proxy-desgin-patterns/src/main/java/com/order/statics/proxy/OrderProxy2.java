package com.order.statics.proxy;

import com.order.statics.service.impl.OrderServiceImpl;

/**
 * description: 代理类角色，接口继承方式
 * date: 2020/9/14 23:13
 * author: Calvin
 * version: 1.0
 */
public class OrderProxy2 extends OrderServiceImpl {

    public void order() {
        System.out.println("静态代理-通过继承方式-日志收集开始...");
        super.order();
        System.out.println("静态代理-通过继承方式-日志收集结束...");
    }

}
