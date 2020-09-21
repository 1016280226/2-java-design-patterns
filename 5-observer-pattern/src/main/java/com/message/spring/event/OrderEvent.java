package com.message.spring.event;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * description: OrderEvent
 * date: 2020/9/16 4:07
 * author: Calvin
 * version: 1.0
 */
@Getter
@Setter
public class OrderEvent extends ApplicationEvent {

    /**
     * 消息内容
     */
    private JSONObject message;

    public OrderEvent(Object source, JSONObject message) {
        super(source);
        this.message = message;
        System.out.println(source);
    }



}
