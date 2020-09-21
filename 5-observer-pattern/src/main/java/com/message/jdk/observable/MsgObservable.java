package com.message.jdk.observable;

import java.util.Observable;

/**
 * description: 具体消息主题
 * date: 2020/9/16 3:25
 * author: Calvin
 * version: 1.0
 */
public class MsgObservable extends Observable {

    /**
     * 重写父类方法: 发送消息通知给所有观察者
     * @param arg 发送消息体
     */
    @Override
    public void notifyObservers(Object arg) {
        // 1. 设置改变，使用发送所有消息
        setChanged();
        // 2. 发送消息通知给所有观察者
        super.notifyObservers(arg);
    }

}
