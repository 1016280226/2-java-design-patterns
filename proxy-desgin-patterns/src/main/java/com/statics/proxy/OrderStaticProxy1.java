package com.statics.proxy;

import com.statics.service.OrderStaticService;
import com.statics.service.OrderStaticServiceImpl;

/**
 * Created by Calvin on 2019/5/24
 *  静态代理的缺点： 被代理类多的时候，代理类也相应增多，代码非常冗余
 *
 */

/*
 *  第一种: 静态代理-通过实现接口形式
 */
public class OrderStaticProxy1 implements OrderStaticService {

    /** 被带离对象**/
    private OrderStaticService orderService;

    OrderStaticProxy1(OrderStaticService orderService){
        this.orderService = orderService;
    }

    @Override
    public void order() {
        System.out.println("打印订单日志开始");
        orderService.order();
        System.out.println("打印订单日志结束");
    }

    public static void main(String[] args) {
        OrderStaticProxy1 orderProxy = new OrderStaticProxy1(new OrderStaticServiceImpl());
        orderProxy.order();
    }
}

/**
 * 第二种: 静态代理-通过继承接口形式
 */
class OrderStaticProxy2 extends OrderStaticServiceImpl{

    public void order(){
        System.out.println("打印订单日志开始");
        super.order();
        System.out.println("打印订单日志结束");
    }

    public static void main(String[] args) {
        OrderStaticProxy2 orderProxy = new OrderStaticProxy2();
        orderProxy.order();
    }
}