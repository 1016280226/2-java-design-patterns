package com.computer.builder;

import com.computer.abstracts.Builder;
import com.computer.abstracts.Computer;
import com.computer.service.impl.MacBookServiceImpl;

/**
 * description: MacBookBuilder
 * date: 2020/9/10 17:07
 * author: Calvin
 * version: 1.0
 */
public class MacBookBuilder extends Builder {

    private Computer computer;

    public MacBookBuilder (){
        computer = new MacBookServiceImpl();
    }

    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOs() {
        computer.setOs();
    }

    @Override
    public Computer build() {
        return computer;
    }

}
