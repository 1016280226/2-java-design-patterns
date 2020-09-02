package com.pay.strategy;

import com.pay.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/8
 * 通过AliPay 策略实现共同的骨架
 */
@Component
public class AliPayStrategy implements PayStrategy {

    public String toPayHtml() {
        return "调用支付宝接口...";
    }
}
