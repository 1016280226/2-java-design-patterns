package com.car.abstracts.factory;


import com.car.abstracts.enumeration.CarCategoryEnum;
import com.car.abstracts.service.ChairService;
import com.car.abstracts.service.EngineService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * description: CarFactory
 * date: 2020/9/10 0:47
 * author: Calvin
 * version: 1.0
 */
public abstract class AutomobileSalesServiceFactory {

    /**
     * 创建发动机
     */
    abstract EngineService createEngine();

    /**
     * 创建座椅
     */
    abstract ChairService createChair();

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
     * 汽车构建过程
     * @param carBrandFactory 具体汽车品牌工厂
     * @param sbuild 构建拼装
     * @throws InvocationTargetException 调用目标异常
     * @throws IllegalAccessException 非法访问异常
     */
    public static void build(Object carBrandFactory, StringBuilder sbuild) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = carBrandFactory.getClass().getDeclaredMethods();
        for (Method m : declaredMethods) {
            m.setAccessible(true);
            if (m.getName().equals("createEngine")) {
                EngineService engineService = (EngineService) m.invoke(carBrandFactory, null);
                String run = engineService.run();
                String start = engineService.start();
                sbuild.append(run)
                        .append("\n")
                        .append(start)
                        .append("\n");

            }
            if (m.getName().equals("createChair")) {
                ChairService chairService = (ChairService) m.invoke(carBrandFactory, null);
                String function = chairService.function();
                sbuild.append(function).append("\n");
            }
        }
    }

}
