package com.gilxyj.javassm01.config;

import com.gilxyj.javassm01.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
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
