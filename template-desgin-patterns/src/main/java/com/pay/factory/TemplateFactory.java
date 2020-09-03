package com.pay.factory;

import com.pay.enumeration.PayCallbackTemplateEnum;
import com.pay.service.abstracts.AbstractPayCallbackTemplate;
import com.pay.utils.ContextUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
@Slf4j
public class TemplateFactory {

    public static AbstractPayCallbackTemplate getPayCallbackTemplate(String templateId){
        AbstractPayCallbackTemplate abstractPayCallbackTemplate = null;
        // 1. 获取枚举中的ClassName
        try {
            String className = PayCallbackTemplateEnum.valueOf(templateId).getClassName();
            // 2. 使用java 反射技术初始化类
            abstractPayCallbackTemplate = (AbstractPayCallbackTemplate)Class.forName(className).newInstance();
        } catch (Exception e) {
            log.error("============== 反射类不存在，错误：{} ====================", e.getMessage());
        }
        return abstractPayCallbackTemplate;
    }
}
