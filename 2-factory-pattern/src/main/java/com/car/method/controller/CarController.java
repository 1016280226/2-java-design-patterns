package com.car.method.controller;

import com.car.method.factory.AutomobileSalesServiceFactory;
import com.car.method.service.CarService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 4S 汽车服务中心
 * date: 2020/9/9 15:45
 * author: Calvin
 * version: 1.0
 */
@RestController(value = "CarController2")
@RequestMapping(value = "car/sale")
public class CarController {

    @GetMapping("brand")
    public String barndAndModel(@Param("name") String name, @Param("model") String model) {
        // 1. 获取对应的品牌汽车工厂
        Object carBrandFactory = AutomobileSalesServiceFactory.getBrandFactory(name);
        // 2. 获取该品牌汽车型号
        CarService carService = AutomobileSalesServiceFactory.getCarModel(carBrandFactory, model);
        return carService.create();
    }
}