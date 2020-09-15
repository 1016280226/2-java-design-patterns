package com.computer.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * description: ComputerEnum
 * date: 2020/9/10 17:33
 * author: Calvin
 * version: 1.0
 */
@Getter
@AllArgsConstructor
public enum ComputerBuildEnum {

    MAC_BUILD("苹果电脑","com.computer.builder.MacBookBuilder"),
    WINDOWS_BUIlD("Window电脑", "com.computer.builder.WindowsBookBuilder"),
    ;

    private String OsComputer;
    private String builderBeanName;
}
