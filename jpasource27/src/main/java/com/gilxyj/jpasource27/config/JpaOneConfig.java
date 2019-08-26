package com.gilxyj.jpasource27.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @program: jpasource27
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-26 22:36
 **/
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.gilxyj.jpasource27.dao1",entityManagerFactoryRef = "localContainerEntityManagerFactoryBeanOne",transactionManagerRef = "platformTransactionManagerOne")
public class JpaOneConfig {

    @Resource(name="dsOne")
    DataSource dsOne;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeanOne(EntityManagerFactoryBuilder entityManagerFactoryBuilder){
        return  entityManagerFactoryBuilder.dataSource(dsOne).properties(jpaProperties.getProperties()).packages("com.gilxyj.jpasource27.bean").persistenceUnit("pu1").build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManagerOne(EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = localContainerEntityManagerFactoryBeanOne(builder);
        return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getObject());
    }


}
