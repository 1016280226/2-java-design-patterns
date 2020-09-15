package com.message.observable;

import com.message.observer.MessageObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 微信公众号（具体主题）
 * date: 2020/9/16 1:26
 * author: Calvin
 * version: 1.0
 */
public class MessageObservableImpl implements MessageObservable {

    /**
     * 存放所有的观察者
     */
    private List<MessageObserver> messageObservers = new ArrayList<>(0);

    @Override
    public void addObserver(MessageObserver messageObserver) {
        messageObservers.add(messageObserver);
    }

    @Override
    public void removeObserver(MessageObserver messageObserver) {
        messageObservers.remove(messageObserver);
    }

    @Override
    public void notifyObservers(String message) {
        messageObservers.forEach(observer -> {
            // 观察者更新接收消息
            observer.update(message);
        });
    }
}
