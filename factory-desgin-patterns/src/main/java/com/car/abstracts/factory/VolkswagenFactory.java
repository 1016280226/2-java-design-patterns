package com.car.abstracts.factory;

import com.car.abstracts.service.ChairService;
import com.car.abstracts.service.EngineService;
import com.car.abstracts.service.impl.VolkswagenChairServiceImpl;
import com.car.abstracts.service.impl.VolkswagenEngineServiceImpl;

/**
 * description: NioCarFactory
 * date: 2020/9/10 0:46
 * author: Calvin
 * version: 1.0
 */
public class VolkswagenFactory extends AutomobileSalesServiceFactory {
    @Override
    EngineService createEngine() {
        return new VolkswagenEngineServiceImpl();
    }

    @Override
    ChairService createChair() {
        return new VolkswagenChairServiceImpl();
    }
}
