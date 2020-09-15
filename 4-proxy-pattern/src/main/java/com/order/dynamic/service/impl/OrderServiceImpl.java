package com.order.dynamic.service.impl;

import com.order.dynamic.service.OrderService;

/**
 * description: 委托类角色（Proxied）
 * date: 2020/9/14 22:55
 * author: Calvin
 * version: 1.0
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public void order() {
        System.out.println("下单操作.....");
    }

}
