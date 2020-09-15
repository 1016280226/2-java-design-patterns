package com.car.abstracts.service.impl;

import com.car.abstracts.service.EngineService;

/**
 * description: 蔚来-发动机
 * date: 2020/9/10 0:24
 * author: Calvin
 * version: 1.0
 */
public class NioCarEngineServiceImpl implements EngineService {

    @Override
    public String run() {
        return "【蔚来】品牌发动机是xxxx提速140码转速20000";
    }

    @Override
    public String start() {
        return "【蔚来】品牌是自动挡，启动快";
    }
}
