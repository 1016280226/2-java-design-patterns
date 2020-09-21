package com.order.controller;

import com.order.context.Context;
import com.order.enumeration.OrderStateEnum;
import com.order.service.OrderStateService;
import com.order.utils.ContextUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: OrderStateController
 * date: 2020/9/21 13:55
 * author: Calvin
 * version: 1.0
 */
@RestController
@RequestMapping("order")
public class OrderStateController {


    @GetMapping(value = "state")
    public String state(@RequestParam OrderStateEnum orderState) {
        String className = orderState.getBeanName();
        OrderStateService orderStateService = (OrderStateService) ContextUtils.getBean(className);
        Context contextState = new Context(orderStateService);
        return contextState.switchOrderState();
    }
}
