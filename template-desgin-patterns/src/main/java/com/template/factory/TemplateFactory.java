package com.template.factory;

import com.template.abstracts.AbstractPayCallbackTemplate;
import com.template.utils.ContextUtils;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
public class TemplateFactory {

    public static AbstractPayCallbackTemplate getPayCallbackTemplate(String tempateId){
        AbstractPayCallbackTemplate abstractPayCallbackTemplate = (AbstractPayCallbackTemplate) ContextUtils.getBean(tempateId);
        return abstractPayCallbackTemplate;
    }
}
