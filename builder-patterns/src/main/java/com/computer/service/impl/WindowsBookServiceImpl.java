package com.computer.service.impl;

import com.computer.abstracts.Computer;

/**
 * description: Window电脑-具体实现类
 * date: 2020/9/10 16:55
 * author: Calvin
 * version: 1.0
 */
public class WindowsBookServiceImpl extends Computer {

    @Override
    public void setOs() {
        os = "Windows 10";
        System.out.println(os);
    }

}
