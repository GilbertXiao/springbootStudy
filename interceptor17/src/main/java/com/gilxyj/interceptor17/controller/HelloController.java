package com.gilxyj.interceptor17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: interceptor17
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-18 14:48
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/hello2")
    public String hello2(){
        System.out.println("hello2");
        return "hello2";
    }
}
