package com.computer.abstracts;

import lombok.ToString;

/**
 * description: 计算机（抽象产品类）
 * date: 2020/9/10 16:51
 * author: Calvino
 * version: 1.0
 */
@ToString
public abstract class Computer {

    public Computer() {
    }

    /**
     * 主机
     */
    protected String board;

    /**
     * 显示器
     */
    protected String display;

    /**
     * 操作系统
     */
    protected String os;

    /**
     * 设置主机
     *
     * @param board 主机
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * 设置显示器
     * @param display 显示器
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     *  设置操作系统
     */
    public abstract void setOs();

}
