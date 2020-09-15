package com.car.smiple.controller;

import com.car.smiple.factory.AutomobileSalesFactory;
import com.car.smiple.service.CarService;
import lombok.SneakyThrows;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: CarController
 * date: 2020/9/9 15:45
 * author: Calvin
 * version: 1.0
 */
@RestController(value = "CarController1")
@RequestMapping(value = "car/introduce")
public class CarController {

    @SneakyThrows
    @GetMapping("brand")
    public String brand(@Param("name") String name) {
        CarService carService = AutomobileSalesFactory.introduceCarBrand(name);
        return carService.brand();
    }

}
