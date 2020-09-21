package com.message.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.message.spring.event.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: OrderController
 * date: 2020/9/16 4:19
 * author: Calvin
 * version: 1.0
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private ApplicationContext applicationContext;


    @GetMapping(value = "")
    public String order() {
        System.out.println("创建订单...");
        //
        OrderEvent orderEvent = new OrderEvent(this, message());
        // 推送事件
        applicationContext.publishEvent(orderEvent);
        return "下单成功，发送消息";

    }

    /**
     * 组装消息
     * @return
     */
    private JSONObject message () {
        // 组装消息内容
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "1016280226@qq.com");
        jsonObject.put("phone", "13652352060");
        jsonObject.put("text", "我使用的Spring事件监听器");
        return jsonObject;
    }
}
