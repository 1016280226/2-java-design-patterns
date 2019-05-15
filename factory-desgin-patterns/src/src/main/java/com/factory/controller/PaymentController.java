package com.factory.controller;

import com.factory.factory.PaymentFactory;
import com.factory.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
@RestController
public class PaymentController {

    @GetMapping(value = "pay/{payType}")
    public String payment(@PathVariable String payType){
        PaymentService paymentService = PaymentFactory.getPaymentService(payType);
        if(null == paymentService) throw new RuntimeException("没有相应的支付渠道");
        paymentService.pay();
        return "支付成功";
    }
}
