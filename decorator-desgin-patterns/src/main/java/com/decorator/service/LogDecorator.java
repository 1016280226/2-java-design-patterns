package com.decorator.service;

import com.decorator.abstracts.GatewayComponent;
import com.decorator.decorator.AbstractDecorator;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 定义具体装饰角色-网关日志采集
 */
public class LogDecorator extends AbstractDecorator {

    public LogDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    public LogDecorator() {
    }

    @Override
    public void service() {
        // 调用装饰类service
        super.service();
        // 日志收集
        System.out.println("第二步>>>>日志的采集.....");
    }
}
