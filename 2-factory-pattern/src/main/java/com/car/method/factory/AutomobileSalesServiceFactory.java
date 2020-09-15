package com.car.method.factory;

import com.car.method.enumeration.CarCategoryEnum;
import com.car.method.service.CarService;

import java.lang.reflect.Method;

/**
 * description: 4S 汽车销售服务中心
 * date: 2020/9/9 17:17
 * author: Calvin
 * version: 1.0
 */
public abstract class AutomobileSalesServiceFactory {

    /**
     * 根据汽车种类，创建汽车
     *
     * @param carCategory 汽车种类
     * @return 具体汽车
     */
    abstract CarService createCar(String carCategory);

    /**
     * 获取该汽车品牌
     * @return 汽车品牌
     */
    abstract String getCarBrand();


    /**
     * 获取汽车品牌销售工厂
     *
     * @param brand 汽车品牌
     * @return 相应的汽车品牌销售工厂
     */
    public static Object getBrandFactory(String brand) {
        try {
            CarCategoryEnum categoryEnum = CarCategoryEnum.valueOf(brand);
            String beanName = categoryEnum.getFactoryBeanName();
            Class<?> beanClass = Class.forName(beanName);
            Object o = beanClass.newInstance();
            return o;
        } catch (Exception e) {
            throw new RuntimeException("暂无该【"+ brand +"】品牌汽车!");
        }
    }

    /**
     * 获取品牌汽车的型号
     *
     * @param carBrandFactory 品牌汽车厂商
     * @param model           汽车型号
     * @return 返回对应的汽车型号
     */
    public static CarService getCarModel(Object carBrandFactory, String model) {
        String brand = null;
        try {
            Class<?> carBrandFactoryClass = carBrandFactory.getClass();
            Method getCarBrandMethod = carBrandFactoryClass.getDeclaredMethod("getCarBrand", null);
            brand = (String) getCarBrandMethod.invoke(carBrandFactory, null);
            Method createCarMethod = carBrandFactoryClass.getDeclaredMethod("createCar", String.class);
            CarService carService = (CarService) createCarMethod.invoke(carBrandFactory, model);
            return carService;
        } catch (Exception e) {
            throw new RuntimeException("当前该【" + brand + "】品牌的工厂没有该型号 " + model + " 汽车!");
        }
    }

}
