package com.car.method.factory;


import com.car.method.enumeration.CarCategoryEnum;
import com.car.method.enumeration.TslaCarModleEnum;
import com.car.method.service.CarService;
import lombok.SneakyThrows;

/**
 * description: 特斯拉工厂
 * date: 2020/9/9 17:24
 * author: Calvin
 * version: 1.0
 */
public class TslaFactory extends AutomobileSalesServiceFactory {

    @SneakyThrows
    @Override
    public CarService createCar(String model) {
        CarService carService = null;
        TslaCarModleEnum tslaCarModleEnum = TslaCarModleEnum.valueOf(model);
        if (null != tslaCarModleEnum) {
            String beanName = tslaCarModleEnum.getBeanName();
            Class<?> beanClass = Class.forName(beanName);
            carService = (com.car.method.service.CarService) beanClass.newInstance();
        }
        return carService;
    }

    @Override
    String getCarBrand() {
        return CarCategoryEnum.TSLA.getBrand();
    }
}
