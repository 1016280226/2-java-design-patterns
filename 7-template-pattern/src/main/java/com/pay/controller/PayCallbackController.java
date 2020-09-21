package com.pay.controller;

import com.pay.service.abstracts.AbstractPayCallbackTemplate;
import com.pay.factory.TemplateFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pay")
public class PayCallbackController {

    /**
     * 聚合支付平台-支付回调接口
     * @param templateId 模板ID
     * @return 支付回调结果
     */
    @GetMapping("async/callback/{templateId}")
    public String asyncCallBack(@PathVariable String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = TemplateFactory.getPayCallbackTemplate(templateId);
        if (null == payCallbackTemplate) {
            return "支付回调模板ID有误，没有相应的支付回调模板";
        }
        return payCallbackTemplate.asyncCallBack();
    }

}
