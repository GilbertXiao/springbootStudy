package com.gilxyj.mybatis24;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gilxyj.mybatis24.mapper")
public class Mybatis24Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis24Application.class, args);
    }

}
