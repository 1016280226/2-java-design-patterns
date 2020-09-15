package com.message.observable;


import com.message.observer.MessageObserver;

/**
 * description: 抽象被观察者 （抽象主题角色）
 * date: 2020/9/16 1:11
 * author: Calvin
 * version: 1.0
 */
public interface MessageObservable {

    /**
     * 添加观察者
     *
     * @param messageObserver 观察者
     */
    void addObserver(MessageObserver messageObserver);

    /**
     * 移除观察者
     *
     * @param messageObserver 观察者
     */
    void removeObserver(MessageObserver messageObserver);

    /**
     * 发送消息通知给所有观察者
     *
     * @param message 消息
     */
    void notifyObservers(String message);

}
