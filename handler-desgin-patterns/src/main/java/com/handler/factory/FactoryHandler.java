package com.handler.factory;

import com.handler.handler.Handler;
import com.handler.handler.impl.BlackListHandler;
import com.handler.handler.impl.ConversationHandler;
import com.handler.handler.impl.CurrentLimitHandler;

/**
 * Created by Calvin on 2019/5/9
 * 使用工厂模式封装 Handler 责任链
 */
public class FactoryHandler {

    public  static Handler getHandler(){
        Handler handler1 = new CurrentLimitHandler();
        Handler handler2 = new BlackListHandler();
        handler1.setNextHandler(handler2);
        Handler handler3 = new ConversationHandler();
        handler2.setNextHandler(handler3);
        return handler1;
    }
}
