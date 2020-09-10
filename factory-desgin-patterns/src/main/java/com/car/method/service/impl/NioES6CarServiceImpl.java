package com.car.method.service.impl;


import com.car.method.service.CarService;

/**
 * description: 蔚来汽车-ES6
 * date: 2020/9/9 15:24
 * author: Calvin
 * version: 1.0
 */
public class NioES6CarServiceImpl implements CarService {


    @Override
    public String create() {
        String car = "我是蔚来, 我是电动汽车, 我的型号是 ES6";
        System.out.println(car);
        return car;
    }
}
