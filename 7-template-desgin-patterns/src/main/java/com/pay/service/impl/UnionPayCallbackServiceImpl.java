package com.pay.service.impl;

import com.pay.service.UnionPayCallbackService;
import com.pay.service.abstracts.AbstractPayCallbackTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class UnionPayCallbackServiceImpl extends AbstractPayCallbackTemplate implements UnionPayCallbackService {

    @Override
    protected Map<String, String> verifySignature() {

        /**
         * 下面代码为伪代码：银联支付回调报文
         */
        log.info(">>>>>第一步：解析【银联】支付数据报文.....verifySignature()");
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
        log.info(">>>>> 第三步: 执行回调后的业务方法 asyncService() 参数 verifySignatureMap:{}", verifySignature);
        String paymentStatus = verifySignature.get("paymentStatus");
        if (paymentStatus.equals("1")) {
            String orderNumber = verifySignature.get("orderNumber");
            log.info(">>>>orderNumber：{orderNumber},已经支付成功 修改订单状态为已经支付...");
        }
        return resultSuccess();
    }

    @Override
    protected String resultSuccess() {
        return "【银联】 支付成功！";
    }

    @Override
    protected String resultFail() {
        return "【银联】 支付失败！";
    }
}