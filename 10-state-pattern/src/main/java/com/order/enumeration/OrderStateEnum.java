package com.order.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStateEnum {

    INTRANSIT("inTransitOrderStateServiceImpl"),
    SHIPPED("shippedOrderStateImpl"),
    SIGNED("signedOrderStateServiceImpl"),
    ;

    /** class 完整地址 **/
    private String beanName;

}
