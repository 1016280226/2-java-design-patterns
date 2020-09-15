package com.car.abstracts.factory;

import com.car.abstracts.service.ChairService;
import com.car.abstracts.service.EngineService;
import com.car.abstracts.service.impl.NioCarChairServiceImpl;
import com.car.abstracts.service.impl.NioCarEngineServiceImpl;

/**
 * description: NioCarFactory
 * date: 2020/9/10 0:46
 * author: Calvin
 * version: 1.0
 */
public class NioCarFactory extends AutomobileSalesServiceFactory {

    @Override
    EngineService createEngine() {
        return new NioCarEngineServiceImpl();
    }

    @Override
    ChairService createChair() {
        return new NioCarChairServiceImpl();
    }
}
