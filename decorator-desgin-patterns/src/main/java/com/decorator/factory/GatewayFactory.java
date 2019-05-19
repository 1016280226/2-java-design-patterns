package com.decorator.factory;

import com.decorator.abstracts.GatewayComponent;
import com.decorator.service.LimitDecorator;
import com.decorator.service.LogDecorator;
import com.decorator.service.base.BasicComponentGateway;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 网关工厂获取装饰类，并控制执行顺序
 */
public class GatewayFactory {

   public static GatewayComponent getGatewayComponent(){
       // 1. 实例基础功能
       BasicComponentGateway basicComponentGateway = new BasicComponentGateway();

       // 2.在附加基础的功能上添加- 新增日志收集
       LogDecorator logDecorator = new LogDecorator(basicComponentGateway);

       // 3.在附加基础的功能上添加- 新增Api接口限流
       LimitDecorator limitDecorator = new LimitDecorator(logDecorator);

       // 4. 返回最有一个（最后一个拥有所有的功能）
       return limitDecorator;
   }
}
