package com.pay.service.impl;

import com.pay.entity.PaymentChannelEntity;
import com.pay.mapper.PaymentChannelMapper;
import com.pay.service.PayService;
import com.pay.strategy.PayStrategy;
import com.pay.strategy.factory.StrategyFactory;
import com.pay.utils.ContextUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/11
 */
@Component
public class PayServiceImpl implements PayService {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    @Override
    public String toPayHtml1(String payCode) {
        // 1.使用payCode 参数查询数据库获取beanId
        PaymentChannelEntity paymentChannelEntity = paymentChannelMapper.getPaymentChannel(payCode);
        if (paymentChannelEntity == null) return "暂不支持该渠道支付方式";
        // 2.获取Bean的ID之后，使用Spring容器获取实例对象
        String strategyBeanId = paymentChannelEntity.getStrategyBeanId();
        if(StringUtils.isEmpty(strategyBeanId)){
            return "该渠道没有BeanID";
        }
        // 3.执行该实现的方法
        PayStrategy payStrategy = ContextUtils.getBean(strategyBeanId, PayStrategy.class);
        return payStrategy.toPayHtml();
    }

    @Override
    public String toPayHtml2(String payCode) {
        PayStrategy payStrategy = StrategyFactory.getPayStrategy(payCode);
        if (null == payStrategy) {
            return "暂不支持该渠道支付方式";
        }
        return payStrategy.toPayHtml();
    }

}
