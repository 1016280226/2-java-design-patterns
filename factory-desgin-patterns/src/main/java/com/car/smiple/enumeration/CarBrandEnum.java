package com.car.smiple.enumeration;

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
public enum  CarBrandEnum {

    NIO("蔚来", "com.car.smiple.service.impl.NioCarServiceImpl"),
    TSLA("特斯拉", "com.car.smiple.service.impl.TslaCarServiceImpl"),
    ;

    /** 品牌名称 */
    private String name;
    /** 具体实现类的路径 */
    private String beanName;

}
