package com.car.abstracts.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * description: 汽车品牌枚举
 * date: 2020/9/9 15:33
 * author: Calvin
 * version: 1.0
 */
@Getter
@AllArgsConstructor
public enum CarCategoryEnum {

    NIO("蔚来工厂", "蔚来", "com.car.abstracts.factory.NioCarFactory"),
    VOLKSWAGEN("大众工厂", "一汽大众", "com.car.abstracts.factory.VolkswagenFactory"),
    ;

    /** 名称 */
    private String factory;
    /** 品牌 */
    private String brand;
    /** 具体实现类的路径 */
    private String factoryBeanName;

}
