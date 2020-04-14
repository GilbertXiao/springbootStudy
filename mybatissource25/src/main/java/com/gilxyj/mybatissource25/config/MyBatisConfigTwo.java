package com.gilxyj.mybatissource25.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @program: mybatissource25
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-25 13:43
 **/
@Configuration
@MapperScan(basePackages = "com.gilxyj.mybatissource25.mapper2",sqlSessionFactoryRef = "sqlSessionFactoryTwo")
public class MyBatisConfigTwo {

    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Bean
    SqlSessionFactory sqlSessionFactoryTwo() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dsTwo);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplateTwo() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryTwo());
    }




}
