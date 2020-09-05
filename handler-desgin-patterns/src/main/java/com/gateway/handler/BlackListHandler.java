package com.gateway.handler.impl;

import com.gateway.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/9
 */
@Component
public class BlackListHandler extends Handler {

    @Override
    public void handler() {
        System.out.println("第二关 黑名单拦截 ......");
        // 第二关执行第三关任务
        getNextHandler();
    }
}
