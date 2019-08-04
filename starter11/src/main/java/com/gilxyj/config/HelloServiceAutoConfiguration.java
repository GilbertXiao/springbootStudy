package com.gilxyj.config;

import com.gilxyj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: starter11
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 22:08
 **/
@Configuration
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }




}
