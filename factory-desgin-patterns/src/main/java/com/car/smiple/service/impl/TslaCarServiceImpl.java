package com.car.smiple.service.impl;

import com.car.smiple.service.CarService;

/**
 * description: 特斯拉汽车
 * date: 2020/9/9 15:22
 * author: Calvin
 * version: 1.0
 */
public class TslaCarServiceImpl implements CarService {

    @Override
    public String brand() {
        String brandIntroduce = "我是特斯拉, 我是电动汽车";
        System.out.println(brandIntroduce);
        return brandIntroduce;
    }
}
