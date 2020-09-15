package com.car.smiple.factory;


import com.car.smiple.enumeration.CarBrandEnum;
import com.car.smiple.service.CarService;

/**
 * description: 4S 汽车销售工厂
 * date: 2020/9/9 15:26
 * author: Calvin
 * version: 1.0
 */
public class AutomobileSalesFactory {

    /**
     * 根据汽车名称，介绍对应的汽车信息
     * @param carName 汽车名称
     * @return 对应的汽车信息
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static CarService introduceCarBrand(String carName) {
        CarService carService = null;
        try {
            CarBrandEnum carBrandEnum = CarBrandEnum.valueOf(carName);
            if (null != carBrandEnum) {
                String beanName = carBrandEnum.getBeanName();
                Class<?> beanClass = Class.forName(beanName);
                carService = (CarService) beanClass.newInstance();
            }
        } catch (Exception e) {
            throw new RuntimeException("没有该品牌汽车!");
        }
        return carService;
    }
}
