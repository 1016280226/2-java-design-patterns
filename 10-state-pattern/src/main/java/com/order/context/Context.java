package com.order.context;

import com.order.service.OrderStateService;

/**
 * description: Context 也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * date: 2020/9/21 13:44
 * author: Calvin
 * version: 1.0
 */
public class Context {

    /**
     * 订单状态
     */
    private OrderStateService orderState;

    /**
     * 构造函数
     * @param orderState 订单状态
     */
    public Context(OrderStateService orderState) {
        this.orderState = orderState;
    }

    /**
     * 返回客户选择的状态
     */
    public String switchOrderState() {
        return orderState.state();
    }

}
