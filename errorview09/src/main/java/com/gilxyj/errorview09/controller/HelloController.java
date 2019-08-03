package com.gilxyj.errorview09.controller;

import com.gilxyj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: errorview09
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-30 23:14
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService testService;
    @GetMapping("/hello")
    public String hello(){
        int i=10/0;
        return "hello";
    }

    @GetMapping("/starter")
    public String starterTest(){
       return testService.sayHello();
    }
}
