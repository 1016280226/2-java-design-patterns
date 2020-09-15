package com.car.method.service.impl;

import com.car.method.service.CarService;

/**
 * description: 特斯拉汽车-MODEL S
 * date: 2020/9/9 15:22
 * author: Calvin
 * version: 1.0
 */
public class TslaModelSCarServiceImpl implements CarService {

    @Override
    public String create() {
        String car = "我是特斯拉, 我是电动汽车, 我的型号是 Model S";
        System.out.println(car);
        return car;
    }
}
