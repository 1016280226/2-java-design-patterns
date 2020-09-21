package com.order.service;

/**
 * description: 订单状态: 定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * date: 2020/9/21 13:35
 * author: Calvin
 * version: 1.0
 */
public interface OrderStateService {

    /**
     * 订单状态
     * @return 订单状态内容
     */
    String state();
}
