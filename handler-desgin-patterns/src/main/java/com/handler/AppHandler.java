package com.handler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.handler.mapper")
public class AppHandler {
    public static void main(String[] args) {
        SpringApplication.run(AppHandler.class);
    }
}
