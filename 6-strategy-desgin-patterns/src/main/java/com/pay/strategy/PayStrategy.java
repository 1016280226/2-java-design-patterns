package com.pay.strategy;

/**
 * Created by Calvin on 2019/5/8
 *  策略模式: 共同定义的骨架
 */
public interface PayStrategy {

    /**
     *  共同行为
     *
     * @return
     */
    public String toPayHtml();
}
