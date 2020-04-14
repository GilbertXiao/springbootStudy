package com.gilxyj.javassm01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilxyj.javassm01.service.HelloService;

/**
 * @program: javassm01
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-20 15:56
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
