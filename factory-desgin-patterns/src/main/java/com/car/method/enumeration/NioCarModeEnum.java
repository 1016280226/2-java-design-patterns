package com.car.method.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * description: TslaCarModleEnum
 * date: 2020/9/9 17:47
 * author: Calvin
 * version: 1.0
 */
@Getter
@AllArgsConstructor
public enum  NioCarModeEnum {

    EC6("蔚来EC6", "com.car.method.service.impl.NioEC6CarServiceImpl"),
    ES6("蔚来ES6", "com.car.method.service.impl.NioES6CarServiceImpl"),
    ES8("蔚来ES8", "com.car.method.service.impl.NioES8CarServiceImpl"),
    ;

    /** 名称 */
    private String name;
    /** 具体实现类的路径 */
    private String beanName;
}
