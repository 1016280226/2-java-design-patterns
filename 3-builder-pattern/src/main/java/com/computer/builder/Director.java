package com.computer.builder;

import com.computer.abstracts.Builder;

/**
 * description: Director
 * date: 2020/9/10 17:22
 * author: Calvin
 * version: 1.0
 */
public class Director {

    Builder builder = null;

    /**
     * 初始化构造函数
     * @param builer 构建抽象类
     */
    public Director(Builder builer) {
        this.builder = builer;
    }

    /**
     * 统一组建构建：主机、显示器、操作系统
     * @param board 主机
     * @param display 显示器
     */
    public void construct(String board,String display){
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }

}
