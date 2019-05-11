package com.template.abstracts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.Map;

/**
 * Created by Calvin on 2019/5/11
 */
@Slf4j
public class AbstractPayCallbackTemplate {

    /**
     *  定义共同行为的骨架
     *
     * @return
     */
    public String asyncCallBack(){
        // 1.验证参数和签名
        Map<String,String> verifySignature = verifySignature();
        // 2.日志收集
        payLog(verifySignature);
        // 3.更新状态，返回支付结果
        return asyncService(verifySignature);
    }

    /**
     * 验证参数
     *
     * @return
     */
    private Map<String, String> verifySignature() {

            return  null;
    }


    /**
     * 使用多线程异步写入日志
     *
     * @param verifySignature
     */
    @Async
    public void payLog(Map<String, String> verifySignature) {
        log.info("写入数据库.. verifySignature:{}", verifySignature);
    }

    /**
     * 执行修改状态和返回
     *
     * @param verifySignature
     * @return
     */
    private String asyncService(Map<String, String> verifySignature) {
        return null;
    }

}
