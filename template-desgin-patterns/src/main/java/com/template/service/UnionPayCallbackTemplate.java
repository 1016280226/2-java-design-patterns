package com.template.service;

import com.template.abstracts.AbstractPayCallbackTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class UnionPayCallbackTemplate extends AbstractPayCallbackTemplate {
    @Override
    protected Map<String, String> verifySignature() {
        //>>>>假设一下为银联回调报文>>>>>>>>>>>>>>>>
        log.info(">>>>>第一步 解析银联数据报文.....verifySignature()");
        Map<String, String> verifySignature = new HashMap<>();
        verifySignature.put("price", "1399");
        verifySignature.put("orderDes", "充值蚂蚁课堂永久会员");
        // 支付状态为1表示为成功....
        verifySignature.put("paymentStatus", "1");
        verifySignature.put("orderNumber", "201910101011");
        // 解析报文是否成功 200 为成功..
        verifySignature.put("analysisCode", "200");
        return verifySignature;
    }
    @Override
    protected String asyncService(Map<String, String> verifySignature) {
        log.info(">>>>>第三步asyncService()verifySignatureMap:{}", verifySignature);
        String paymentStatus = verifySignature.get("paymentStatus");
        if (paymentStatus.equals("1")) {
            String orderNumber = verifySignature.get("orderNumber");
            log.info(">>>>orderNumber:{orderNumber},已经支付成功 修改订单状态为已经支付...");
        }
        return resultSuccess();
    }

    @Override
    protected String resultSuccess() {
        return "success";
    }

    @Override
    protected String resultFail() {
        return "fail";
    }
}