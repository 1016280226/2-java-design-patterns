package com.order.dynamic.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Created by Calvin on 2019/5/22
 * 实现 InvocationHandler 接口，对目标接口中声明的所有方法进行统一处理;
 * 调用Proxy的静态方法，创建代理类并生成相应的代理对象;
 */
public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 目标代理对象
     **/
    private Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 下单操作（重写 JDK 调用方法，实现代理业务）
     *
     * @param proxy  目标代理对象
     * @param method 目标方法
     * @param args   方法参数
     * @return 目标对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理-通过实现InvocationHandler-日志收集开始...");
        // 使用java 的反射技术执行
        Object o = method.invoke(target, args);
        System.out.println("动态代理-通过实现InvocationHandler-日志收集结束...");
        return o;
    }

    /**
     * 获取代理对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        /**
         * 第一个参数：目标对象加载类，
         * 第二个参数: 目标对象实现的接口（被代理（房东、车主....））
         * 第三个参数：当前 JdkInvocationHandler
         */
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}