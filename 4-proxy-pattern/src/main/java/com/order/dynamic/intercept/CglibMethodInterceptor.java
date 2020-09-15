package com.order.dynamic.intercept;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * description: CGLIB 方法拦截器
 * date: 2020/9/15 11:21
 * author: Calvin
 * version: 1.0
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    /**
     * 实现拦截
     * @param o 目标类的实例
     * @param method 目标方法实例（通过反射获取的目标方法实例）
     * @param args 目标方法的参数
     * @param methodProxy 代理类的实例
     * @return 被代理类
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("动态代理-通过实现MethodIntercetpor-日志收集开始...");
        Object object = methodProxy.invokeSuper(o, args);
        System.out.println("动态代理-通过实现MethodIntercetpor-日志收集结束...");
        return object;
    }
}
