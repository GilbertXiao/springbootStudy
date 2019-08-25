package com.gilxyj.mybatissource25.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @program: jdbctemplatesources23
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-21 23:38
 **/
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.one")
    DataSource dsOne(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.two")
    DataSource dsTwo(){
        return DruidDataSourceBuilder.create().build();
    }
}
