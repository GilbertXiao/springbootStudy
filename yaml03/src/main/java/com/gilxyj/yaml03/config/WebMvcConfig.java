package com.gilxyj.yaml03.config;

import com.gilxyj.yaml03.interceptor.MyInterceptor1;
import com.gilxyj.yaml03.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: yaml03
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 20:17
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**").excludePathPatterns("/hello2").order(0);
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**").excludePathPatterns("/hello2").order(1);
    }
}
