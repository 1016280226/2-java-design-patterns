package com.pay.strategy;

import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/11
 * 通过微信支付策略实现共同骨架
 */
@Component
public class WechatPayStrategy implements PayStrategy {

    @Override
    public String toPayHtml() {
        return "调用微信接口...";
    }
}
