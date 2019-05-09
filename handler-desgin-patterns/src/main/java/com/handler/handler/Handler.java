package com.handler.handler;

/**
 * Created by Calvin on 2019/5/9
 *  抽象定义handler责任链
 */
public abstract class Handler {

    /**
     * 执行下一个handler 任务
     */
    protected  Handler nextHandler;

    /**
     *  共同的处理行为(强制必须实现)
     */
    public abstract void handler();

    /**
     * 设置下一个处理任务
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    protected void nextHandler(){
        if(nextHandler != null)
            // 指向下一个任务
            nextHandler.handler();
    }
}
