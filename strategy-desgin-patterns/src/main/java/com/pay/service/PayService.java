package com.pay.service;

/**
 * Created by Calvin on 2019/5/11
 */
public interface PayService {

    /**
     * 根据支付码，返回对应的HTML页面 （通过数据库实现策略模式）
     * @param payCode 支付码
     * @return HTML页面
     */
    String toPayHtml1(String payCode);


    /**
     * 根据支付码，返回对应的HTML页面 （通过工厂+枚举实现策略模式）
     * @param payCode 支付码
     * @return HTML页面
     */
    String toPayHtml2(String payCode);
}
