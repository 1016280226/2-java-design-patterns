package com.pay;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pay.mapper")
public class StrategyApplication {
    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class);

        new SqlSessionFactoryBuilder().build()
    }
}
