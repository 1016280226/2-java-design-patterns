package com.message.spring.listener;

import com.message.spring.event.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * description: EmailListener
 * date: 2020/9/16 4:15
 * author: Calvin
 * version: 1.0
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {

    @Async
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println(Thread.currentThread().getName()+"发送短信内容:" + orderEvent.getMessage().toJSONString());
    }
}
