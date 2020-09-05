package com.gateway.handler;

/**
 * Created by Calvin on 2019/5/9
 * 定义一个抽象的处理器
 */
public abstract class Handler {

    /**
     * 下一个处理任务对象
     */
    protected Handler nextHandler;

    /**
     * 共同的处理行为(强制必须实现)
     */
    public abstract void handler();

    /**
     * 设置下一个处理任务
     * @param nextHandler 下一个处理对象
     */
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     * 获取下一个处理任务
     */
    protected void getNextHandler(){
        if(nextHandler != null)
            // 指向下一个任务
            nextHandler.handler();
    }
}
