package com.message.observer;

/**
 * description: 微信公众号观察者（具体观察者）
 * date: 2020/9/16 1:26
 * author: Calvin
 * version: 1.0
 */
public class SmsObserver implements MessageObserver {

    /**
     * 订阅者用户名称
     */
    private String name;

    /**
     * 发送内容
     */
    private String message;


    public SmsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        println();
    }

    private void println() {
        System.out.println("【" + name + "】" + "收到短息消息:" + message);
    }

}
