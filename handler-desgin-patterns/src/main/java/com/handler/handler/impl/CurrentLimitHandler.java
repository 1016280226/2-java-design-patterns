package com.handler.handler.impl;

import com.handler.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/9
 */
@Component
public class CurrentLimitHandler extends Handler {

    @Override
    public void handler() {
        System.out.println("第一关 API接口限流操作......");
        // 第一关执行完毕执行第二关
        nextHandler();
    }
}
