package com.gateway.component.abstracts;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:  抽象装饰者
 * 作用：持有对具体构建角色的引用，并定义与抽象构件角色一致的接口
 */
public abstract class AbstractDecorator extends GatewayComponent {

    protected GatewayComponent gatewayComponent;

    public AbstractDecorator(){}

    public AbstractDecorator(GatewayComponent gatewayComponent){
        this.gatewayComponent = gatewayComponent;
    }

    public void setGatewayComponent(GatewayComponent gatewayComponent) {
        if (gatewayComponent != null) {
            this.gatewayComponent = gatewayComponent;
        }
    }

    @Override
    public void function() {
        gatewayComponent.function();
    }

}
