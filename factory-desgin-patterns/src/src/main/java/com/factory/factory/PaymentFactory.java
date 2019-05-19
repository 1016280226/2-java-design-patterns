package com.factory.factory;

import com.factory.service.AliPayServiceImpl;
import com.factory.service.PaymentService;
import com.factory.service.WechatServiceImpl;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description: 支付功能工厂
 */
public class PaymentFactory {

    public static PaymentService getPaymentService(String payType){
        PaymentService paymentService = null;
        switch (payType){
            case "ali_pay":
                paymentService = new AliPayServiceImpl();
                break;
            case "wechat_pay":
                paymentService = new WechatServiceImpl();
                break;
        }
        return paymentService;
    }
}
