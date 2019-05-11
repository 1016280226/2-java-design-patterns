package com.strategy.controller;

import com.strategy.context.PayContextStrategy;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Calvin on 2019/5/11
 */
@RestController
public class PayController {

    @Autowired
    private PayContextStrategy payContextStrategy;

    @RequestMapping("toPayHtml")
    public String toPayHtml(String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "渠道Code 不存在";
        }
        return payContextStrategy.toPayHtml(payCode);
    }
}
