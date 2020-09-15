package com.order.statics.service.impl;

import com.order.statics.service.OrderService;

/**
 * description: 委托类角色（Proxied）
 * date: 2020/9/14 22:55
 * author: Calvin
 * version: 1.0
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public void order() {
        System.out.println("用户下单操作...");
    }
}
