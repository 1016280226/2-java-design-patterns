package com.gateway.component.factory;

import com.gateway.component.BaseComponent;
import com.gateway.component.LimitComponent;
import com.gateway.component.LogComponent;
import com.gateway.component.abstracts.GatewayComponent;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 网关工厂获取装饰类，并控制执行顺序
 */
public class GatewayFactory {

   public static GatewayComponent getGatewayComponent(){
       // 1. 实例基础功能
       BaseComponent baseComponent = new BaseComponent();
       // 2. 在附加基础的功能上添加- 新增日志收集
       LogComponent logDecorator = new LogComponent();
       logDecorator.setGatewayComponent(baseComponent);
       // 3. 在附加基础的功能上添加- 新增Api接口限流
       LimitComponent limitDecorator = new LimitComponent();
       limitDecorator.setGatewayComponent(logDecorator);
       // 4. 执行顺序：新增Api接口限流 -> 新增日志收集 -> 网关基础功能
       return limitDecorator;


   }
}
