package com.decorator.service;

import com.decorator.abstracts.GatewayComponent;
import com.decorator.decorator.AbstractDecorator;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 定义具体装饰角色-网关限流
 */
public class LimitDecorator extends AbstractDecorator {

    public LimitDecorator() {

    }

    public LimitDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        // 1.传递日志收集装饰类
        System.out.println(super.getClass().toString());
        super.service();
        System.out.println("第三步>>>>API接口限流");
    }


}
