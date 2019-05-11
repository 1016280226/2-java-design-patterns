package com.strategy.service;

import com.strategy.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/8
 * 通过银联策略实现共同的骨架
 */
@Component
public class UnionPayStrategy implements PayStrategy {

    public String toPayHtml() {
        return "调用银联接口...";
    }
}
