package com.decorator.abstracts;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 定义网关抽象组件 - 来规范准备附加功能的类
 */
public abstract class GatewayComponent {

    /**
     * 网关功能（共同行为）
     */
    public abstract void service();
}
