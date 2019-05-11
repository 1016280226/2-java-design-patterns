package com.strategy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.strategy.mapper")
public class AppStrategy {
    public static void main(String[] args) {
        SpringApplication.run(AppStrategy.class);
    }
}
