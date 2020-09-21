package com.pay.entity;

import lombok.Data;

/**
 * Created by Calvin on 2019/5/8
 */
@Data
public class PaymentChannelEntity {

    /** ID */
    private Integer id;

    /** 渠道名称 */
    private String channelName;

    /** 渠道ID */
    private String channelId;

    /** 策略执行BeanId */
    private String strategyBeanId;
}
