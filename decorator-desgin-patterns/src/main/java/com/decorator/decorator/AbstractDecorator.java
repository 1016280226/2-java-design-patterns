package com.decorator.decorator;

import com.decorator.abstracts.GatewayComponent;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 定义抽象的装饰角色- 持有对具体构件角色的引用并定义与抽象构件角色一致的接口
 */
public class AbstractDecorator extends GatewayComponent {

    protected  GatewayComponent gatewayComponent;

    public AbstractDecorator(){

    }

    public AbstractDecorator(GatewayComponent gatewayComponent){
        this.gatewayComponent = gatewayComponent;
    }

    public void setComponentGateway(GatewayComponent componentGateway) {
        if (componentGateway != null)
            this.gatewayComponent = componentGateway;
    }

    @Override
    public void service() {
        gatewayComponent.service();
    }


}
