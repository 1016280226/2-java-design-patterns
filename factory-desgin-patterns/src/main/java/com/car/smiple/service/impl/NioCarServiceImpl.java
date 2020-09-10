package com.car.smiple.service.impl;


import com.car.smiple.service.CarService;

/**
 * description: 蔚来汽车
 * date: 2020/9/9 15:24
 * author: Calvin
 * version: 1.0
 */
public class NioCarServiceImpl implements CarService {

    @Override
    public String brand() {
        String brandIntroduce = "我是蔚来汽车，我是电动汽车";
        System.out.println(brandIntroduce);
        return brandIntroduce;
    }
}
