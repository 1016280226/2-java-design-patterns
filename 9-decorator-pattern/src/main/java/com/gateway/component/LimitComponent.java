package com.gateway.component;

import com.gateway.component.abstracts.AbstractDecorator;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 限流組件 (具体装饰角色)
 */
public class LimitComponent extends AbstractDecorator {

    @Override
    public void function() {
        // 1.传递日志收集装饰类
        System.out.println(super.getClass().toString());
        super.function();
        System.out.println(">>>>>> 第三步：API接口限流 >>>>>>");
    }

}
