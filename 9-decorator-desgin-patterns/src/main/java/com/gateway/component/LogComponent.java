package com.gateway.component;

import com.gateway.component.abstracts.AbstractDecorator;
import com.gateway.component.abstracts.GatewayComponent;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 日志采集（具体装饰角色）
 */
public class LogComponent extends AbstractDecorator {

    @Override
    public void function() {
        // 调用装饰类service
        super.function();
        // 日志收集
        System.out.println(">>>>>> 第二步：日志的采集 >>>>>>");
    }
}
