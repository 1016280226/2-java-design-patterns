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
public enum TslaCarModleEnum {

    MODEL_S("特斯拉 MODEL S", "com.car.method.service.impl.TslaModelSCarServiceImpl"),
    MODEL_X("特斯拉 MODEL X", "com.car.method.service.impl.TslaModelXCarServiceImpl"),
    MODEL_3("特斯拉 MODEL 3", "com.car.method.service.impl.TslaModel3CarServiceImpl"),
    ;


    /** 名称 */
    private String name;
    /** 具体实现类的路径 */
    private String beanName;
}
