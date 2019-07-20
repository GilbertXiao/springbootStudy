package com.gilxyj.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program: javassm01
 * @description: 相当于web.xml配置
 * @author: GilbertXiao
 * @create: 2019-07-20 15:39
 **/
public class WebInit implements WebApplicationInitializer {

    /**
     * 当项目启动时，这个方法会被调用，在这个方法中，做项目的初始化操作
     *
     * @param servletContext
     * @throws ServletException
     */
    public void onStartup(ServletContext servletContext) throws ServletException {
        //首先来加载 SpringMVC 的配置文件
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMVCConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic springmvc = servletContext.addServlet("spring-servlet", new DispatcherServlet(context));
        springmvc.addMapping("/");
        springmvc.setLoadOnStartup(1);
    }
}
