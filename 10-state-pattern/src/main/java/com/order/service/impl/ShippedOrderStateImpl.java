package com.order.service.impl;

import com.order.service.OrderStateService;
import org.springframework.stereotype.Service;

/**
 * description: 订单状态-已发货-具体实现
 * date: 2020/9/21 13:37
 * author: Calvin
 * version: 1.0
 */
@Service
public class ShippedOrderStateImpl implements OrderStateService {

    @Override
    public String state() {
        return " >>>订单状态->已发货,请耐心等待...>>>";
    }
}
