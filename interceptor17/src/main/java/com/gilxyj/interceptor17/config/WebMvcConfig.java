package com.gilxyj.interceptor17.config;

import com.gilxyj.interceptor17.interceptor.MyInterceptor1;
import com.gilxyj.interceptor17.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: interceptor17
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-18 14:45
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");

        registry.addInterceptor(new MyInterceptor2())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");
    }
}
