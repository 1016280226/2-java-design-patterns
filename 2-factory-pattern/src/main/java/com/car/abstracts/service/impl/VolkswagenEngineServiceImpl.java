package com.car.abstracts.service.impl;

import com.car.abstracts.service.EngineService;

/**
 * description: 大众汽车-发动机
 * date: 2020/9/10 0:23
 * author: Calvin
 * version: 1.0
 */
public class VolkswagenEngineServiceImpl implements EngineService {

    @Override
    public String run() {
        return "【大众】品牌发动机xxxx提速在140码转速2000";
    }

    @Override
    public String start() {
        return "【大众】品牌手动挡，启动慢";
    }
}
