package com.strategy.context;

import com.strategy.entity.PaymentChannelEntity;
import com.strategy.mapper.PaymentChannelMapper;
import com.strategy.strategy.PayStrategy;
import com.strategy.utils.ContextUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/11
 */
@Component
public class PayContextStrategy {
    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    public String toPayHtml(String payCode) {
        // 1.使用payCode 参数查询数据库获取beanId
        PaymentChannelEntity paymentChannelEntity = paymentChannelMapper.getPaymentChannel(payCode);
        if (paymentChannelEntity == null) return "没有该渠道信息";
        // 2.获取Bean的ID之后，使用Spring容器获取实例对象
        String strategyBeanId = paymentChannelEntity.getStrategyBeanId();
        if(StringUtils.isEmpty(strategyBeanId)){
            return "该渠道没有BeanID";
        }
        // 3.执行该实现的方法
        PayStrategy payStrategy = ContextUtils.getBean(strategyBeanId, PayStrategy.class);
        return payStrategy.toPayHtml();
    }
}
