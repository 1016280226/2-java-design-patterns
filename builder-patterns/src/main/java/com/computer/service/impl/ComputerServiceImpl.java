package com.computer.service.impl;

import com.computer.abstracts.Builder;
import com.computer.abstracts.Computer;
import com.computer.builder.Director;
import com.computer.enumeration.ComputerBuildEnum;
import com.computer.service.ComputerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * description: ComputerServiceImpl
 * date: 2020/9/10 17:29
 * author: Calvin
 * version: 1.0
 */
@Slf4j
@Service
public class ComputerServiceImpl implements ComputerService {

    @Override
    public Computer build(String os) {
        Computer computer = null;
        try {
            ComputerBuildEnum computerBuildEnum = ComputerBuildEnum.valueOf(os);
            String builderBeanName = computerBuildEnum.getBuilderBeanName();
            Class<?> builderClass = Class.forName(builderBeanName);
            Builder builder = (Builder) builderClass.newInstance();
            // 1. 实例监督者，进行组装电脑
            Director director = new Director(builder);
            director.construct("英特尔主板","Retina显示器");
            // 2. 组装后，通过构建者获取对应的电脑
            computer = builder.build();
        } catch (Exception e) {
            log.error("错误的原因：{}", e.getMessage());
            throw new RuntimeException("没有该" + os + "操作系统");
        }
        return computer;
    }
}
