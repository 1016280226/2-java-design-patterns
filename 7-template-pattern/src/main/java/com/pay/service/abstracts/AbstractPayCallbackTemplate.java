package com.pay.service.abstracts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Calvin on 2019/5/11
 * 异步回调-模板方法的抽象类
 */
@Slf4j
@Component
public abstract class AbstractPayCallbackTemplate {

    /**
     * 定义共同算法骨架
     *
     * 聚合支付-异步回调
     * 1. 验签
     * 2. 记录支付回调日志
     * 3. 更改订单状态
     *
     * @return 支付结果
     */
    public String asyncCallBack(){
        // 1.支付回调参数验证。
        Map<String,String> verifySignature = verifySignature();
        // 2.参数验证成功，写入到日志中。
        callBackPayLog(verifySignature);
        String analysisCode = verifySignature.get("analysisCode");
        if(!analysisCode.equals("200")){
            return resultFail();
        }
        // 3. 执行回调异步相关逻辑
        return asyncService(verifySignature);
    }

    /**
     * 聚合支付-记录支付回调日志
     *
     * @param verifySignature 报文验签
     */
    @Async
    public void callBackPayLog(Map<String, String> verifySignature) {
        log.info(">>>>>第二步：记录支付回调日志.....verifySignature：{}", verifySignature);
    }

    /**
     * 聚合支付-验签（每个子类需要实现）
     *
     * @return 验证结果
     */
    protected abstract Map<String, String> verifySignature();

    /**
     * 聚合支付-执行异步回调业务 （每个子类需要实现）
     *
     * @return  返回支付结果
     */
    protected abstract String asyncService(Map<String, String> verifySignature);

    /**
     * 聚合支付-异步返回结果 （每个子类需要实现）
     *
     * @return 返回支付成功结果
     */
    protected abstract String resultSuccess();

    /**
     * 聚合支付-异步返回失败（每个子类需要实现）
     *
     * @return 返回支付失败结果
     */
    protected abstract String resultFail();
}
