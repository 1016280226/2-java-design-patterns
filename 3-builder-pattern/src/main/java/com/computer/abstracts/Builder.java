package com.computer.abstracts;

/**
 * description: Builder
 * date: 2020/9/10 17:03
 * author: Calvin
 * version: 1.0
 */
public abstract class Builder {

    /**
     * 构建主机
     * @param board 主机
     */
    public abstract void buildBoard(String board);

    /**
     * 构建显示器
     * @param display 显示器
     */
    public abstract void buildDisplay(String display);

    /**
     * 构建操作系统
     */
    public abstract void buildOs();

    /**
     * 整体主装
     * @return 完整的计算机
     */
    public abstract Computer build();

}
