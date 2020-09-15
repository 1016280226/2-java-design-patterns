package com.computer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * description: ComputerApplication
 * date: 2020/9/10 17:49
 * author: Calvin
 * version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class);
    }
}
