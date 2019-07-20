package com.gilxyj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @program: javassm01
 * @description: 这个配置类的作用相当于application.xml
 * @author: GilbertXiao
 * @create: 2019-07-20 15:19
 **/

@Configuration
@ComponentScan(basePackages = "com.gilxyj",useDefaultFilters = true,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {

}
