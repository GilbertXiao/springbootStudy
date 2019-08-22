package com.gilxyj.jdbctemplatesources23.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @program: jdbctemplatesources23
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-22 00:13
 **/
@Configuration
public class JdbcTemplateConfig {

    @Bean
    JdbcTemplate jdbcTemplateOne(@Qualifier("dsOne") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    JdbcTemplate jdbcTemplateTwo(@Qualifier("dsTwo") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
