package com.message.observer;

/**
 * description: 抽象观察者
 * date: 2020/9/16 1:14
 * author: Calvin
 * version: 1.0
 */
public interface MessageObserver {

    /**
     * 更新消息内容
     *
     * @param message 消息内容
     */
    void update(String message);
}
