package com.gilxyj.javassm01.config;

import java.nio.charset.Charset;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @program: javassm01
 * @description: 这个配置类的作用相当于spirng-servlet.xml
 * @author: GilbertXiao
 * @create: 2019-07-20 15:20
 */
@Configuration
@ComponentScan(basePackages = "com.gilxyj")
public class SpringMVCConfig extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

        fastJsonHttpMessageConverter.setDefaultCharset(Charset.forName("UTF-8"));

        FastJsonConfig fastJsonConfig = new FastJsonConfig();

        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastJsonHttpMessageConverter);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
