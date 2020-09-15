package com.car.method.factory;


import com.car.method.enumeration.CarCategoryEnum;
import com.car.method.enumeration.NioCarModeEnum;
import com.car.method.service.CarService;
import lombok.SneakyThrows;

/**
 * description: 蔚蓝工厂
 * date: 2020/9/9 17:24
 * author: Calvin
 * version: 1.0
 */
public class NioFactory extends AutomobileSalesServiceFactory {

    @SneakyThrows
    @Override
    public CarService createCar(String model)  {
        com.car.method.service.CarService carService = null;
        NioCarModeEnum nioCarModeEnum = NioCarModeEnum.valueOf(model);
        if (null != nioCarModeEnum) {
            String beanName = nioCarModeEnum.getBeanName();
            Class<?> beanClass = Class.forName(beanName);
            carService = (com.car.method.service.CarService) beanClass.newInstance();
        }
        return carService;
    }

    @Override
    String getCarBrand() {
        return CarCategoryEnum.NIO.getBrand();
    }
}
