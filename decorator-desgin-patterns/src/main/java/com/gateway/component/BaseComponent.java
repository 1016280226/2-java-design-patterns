package com.gateway.component;


import com.gateway.component.abstracts.GatewayComponent;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:  网关基本实现类 （被装饰者）
 *
 */
public class BaseComponent extends GatewayComponent {

    @Override
    public void function() {
        System.out.println(">>>>>> 第一步：网关参数拦截，获取参数信息 >>>>>>");
    }
}
