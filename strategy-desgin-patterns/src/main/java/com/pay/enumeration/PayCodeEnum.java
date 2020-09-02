package com.pay.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PayCodeEnum {

    WECHAT_PAY("com.pay.strategy.WechatPayStrategy"),
    ALI_PAY("com.pay.strategy.AliPayStrategy"),
    UNION_PAY("com.pay.strategy.UnionPayStrategy"),
    ;

    /** class 完整地址 **/
    private String className;

}
