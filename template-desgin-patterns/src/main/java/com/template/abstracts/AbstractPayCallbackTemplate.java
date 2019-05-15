package com.template.abstracts;

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
     *  定义共同行为的骨架
     *
     * @return
     */
    public String asyncCallBack(){
        // 1.支付回调参数验证。
        Map<String,String> verifySignature = verifySignature();
        // 2.参数验证成功，写入到日志中。
        payLog(verifySignature);
        String analysisCode = verifySignature.get("analysisCode");
        if(!analysisCode.equals("200")){
            return resultFail();
        }
        // 3.执行回调异步-> 更新状态，返回支付结果
        return asyncService(verifySignature);
    }

    /**
     * 使用多线程异步写入日志
     *
     * @param verifySignature
     */
    @Async
    public void payLog(Map<String, String> verifySignature) {
        log.info(">>>>>第二步 打印日志参数.....verifySignature", verifySignature);
    }

    /**
     * 验证参数（每个子类需要实现）
     *
     * @return
     */
    protected abstract Map<String, String> verifySignature();


    /**
     *  执行回调异步-> 更新状态，返回支付结果 （每个子类需要实现）
     *
     * @return
     */
    protected abstract String asyncService(Map<String, String> verifySignature);

    /**
     * 异步返回结果 （每个子类需要实现）
     *
     * @return
     */
    protected abstract String resultSuccess();

    /**
     * 异步返回失败（每个子类需要实现）
     *
     * @return
     */
    protected abstract String resultFail();
}
