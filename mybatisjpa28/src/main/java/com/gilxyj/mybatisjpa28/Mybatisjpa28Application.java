package com.gilxyj.mybatisjpa28;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gilxyj.mybatisjpa28.mapper")
public class Mybatisjpa28Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisjpa28Application.class, args);
    }

}
