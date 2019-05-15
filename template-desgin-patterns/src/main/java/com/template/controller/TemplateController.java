package com.template.controller;

import com.template.abstracts.AbstractPayCallbackTemplate;
import com.template.factory.TemplateFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {
    @RequestMapping("pay/async/callback/{templateId}")
    public String asyncCallBack(@PathVariable String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = TemplateFactory.getPayCallbackTemplate(templateId);
        return payCallbackTemplate.asyncCallBack();
    }
}
