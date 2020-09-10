package com.car.abstracts.service.impl;

import com.car.abstracts.service.ChairService;

/**
 * description: 大众汽车-发动机
 * date: 2020/9/10 0:23
 * author: Calvin
 * version: 1.0
 */
public class VolkswagenChairServiceImpl implements ChairService {

    @Override
    public String function() {
        return "【大众】品牌座椅可以不能加热!";
    }
}
