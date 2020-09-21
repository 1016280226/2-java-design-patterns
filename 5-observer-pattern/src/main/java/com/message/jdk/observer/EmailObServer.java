package com.message.jdk.observer;

import com.alibaba.fastjson.JSONObject;
import com.message.jdk.observable.MsgObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * description: 邮件观察者
 * date: 2020/9/16 3:25
 * author: Calvin
 * version: 1.0
 */
public class EmailObServer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
            // 1.获取主题
            MsgObservable messageObServable = (MsgObservable) o;
            System.out.println("发送邮件内容:" + arg);
    }

    public static void main(String[] args) {
        //1.创建主题
        MsgObservable messageObServable = new MsgObservable();
        // 2.添加订阅者
        messageObServable.addObserver(new EmailObServer());
        // 3.组装消息内容
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "1016280226@qq.com");
        jsonObject.put("phone", "13652352060");
        jsonObject.put("text", "我使用的JDK自带观察者");
        messageObServable.notifyObservers(jsonObject.toJSONString());
    }

}

