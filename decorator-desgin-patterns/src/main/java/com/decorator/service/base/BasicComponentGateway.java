package com.decorator.service.base;

import com.decorator.abstracts.GatewayComponent;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 定义被装饰角色(基础功能) - 实现网关拦截参数
 */
public class BasicComponentGateway extends GatewayComponent {
    @Override
    public void service() {
        System.out.println("第一步>>>>网关参数拦截，获取参数信息");
    }
}
