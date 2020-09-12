package com.computer.service.impl;

import com.computer.abstracts.Computer;

/**
 * description: 苹果电脑-具体实现类
 * date: 2020/9/10 16:55
 * author: Calvin
 * version: 1.0
 */
public class MacBookServiceImpl extends Computer {

    @Override
    public void setOs() {
        os = "Mac OS X 12";
        System.out.println(os);
    }

}
