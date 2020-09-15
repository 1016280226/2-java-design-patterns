package com.car.abstracts.controller;

import com.car.abstracts.factory.AutomobileSalesServiceFactory;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

/**
 * description: 4S 汽车服务中心
 * date: 2020/9/9 15:45
 * author: Calvin
 * version: 1.0
 */
@RestController(value = "CarController3")
@RequestMapping(value = "car/choose")
public class CarController {

    @GetMapping("brand")
    public String chooseBrand(@Param("name") String name) throws InvocationTargetException, IllegalAccessException {
        // 1. 获取对应的品牌汽车工厂
        Object carBrandFactory = AutomobileSalesServiceFactory.getBrandFactory(name);
        // 2. 获取对应的品牌建造过程
        StringBuilder sbuild = new StringBuilder();
        AutomobileSalesServiceFactory.build(carBrandFactory,  sbuild);
        return sbuild.toString();
    }
}