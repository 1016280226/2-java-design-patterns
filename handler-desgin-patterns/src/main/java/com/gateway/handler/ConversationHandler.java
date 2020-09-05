package com.gateway.handler.impl;


import com.gateway.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/9
 */
@Component
public class ConversationHandler extends Handler {

    @Override
    public void handler() {
        System.out.println("第三关 用户会话信息拦截 ......");
    }
}
