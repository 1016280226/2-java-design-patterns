package com.template;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AppTemplate {
    public static void main(String[] args) {
        SpringApplication.run(AppTemplate.class);
    }
}
