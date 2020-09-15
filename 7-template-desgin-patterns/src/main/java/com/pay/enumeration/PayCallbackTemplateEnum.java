package com.pay.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PayCallbackTemplateEnum {

    ALI_PAY("com.pay.service.impl.AliPayCallbackServiceImpl"),
    UNION_PAY("com.pay.service.impl.UnionPayCallbackServiceImpl"),
    ;

    /** class 完整地址 **/
    private String className;

}
