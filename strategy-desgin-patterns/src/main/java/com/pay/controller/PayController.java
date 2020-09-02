package com.pay.controller;

import com.pay.service.PayService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Calvin on 2019/5/11
 */
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @PostMapping("to/pay/html")
    public String toPayHtml(@RequestParam( value= "code") String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "渠道Code 不存在";
        }
        return payService.toPayHtml1(payCode);
    }
}
