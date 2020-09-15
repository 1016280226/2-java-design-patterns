package com.message.observer;

import com.message.observable.MessageObservable;
import com.message.observable.MessageObservableImpl;

/**
 * description: 微信公众号观察者（具体观察者）
 * date: 2020/9/16 1:26
 * author: Calvin
 * version: 1.0
 */
public class WechatMpObserver implements MessageObserver {

    /**
     * 订阅者用户名称
     */
    private String name;

    /**
     * 发送内容
     */
    private String message;


    public WechatMpObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        println();
    }

    private void println() {
        System.out.println("【" + name + "】" + "收到微信公众号推送消息:" + message);
    }


    public static void main(String[] args) {
        // 1. 创建具体主题
        MessageObservable messageObservable = new MessageObservableImpl();
        // 2. 添加订阅者
        messageObservable.addObserver(new SmsObserver("Calvin"));
        messageObservable.addObserver(new WechatMpObserver("Calvin"));
        // 3.组装消息内容
        messageObservable.notifyObservers("这是观察者模式");
    }
}
