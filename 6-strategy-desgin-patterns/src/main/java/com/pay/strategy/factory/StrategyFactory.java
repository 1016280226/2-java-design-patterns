package com.pay.strategy.factory;

import com.pay.enumeration.PayCodeEnum;
import com.pay.strategy.PayStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyFactory {

    /**
     * 通过工厂，获取对应的策略
     * @param payCode 支付码
     * @return 对应的策略
     */
    public static PayStrategy getPayStrategy(String payCode) {
        PayStrategy payStrategy = null;
        // 1. 获取枚举中的ClassName
        try {
            String className = PayCodeEnum.valueOf(payCode).getClassName();
            // 2. 使用java 反射技术初始化类
            payStrategy = (PayStrategy)Class.forName(className).newInstance();
        } catch (Exception e) {
            log.error("============== 反射类不存在，错误：{} ====================", e.getMessage());
            return null;
        }
        return payStrategy;
    }

}
