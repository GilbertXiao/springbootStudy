package com.gilxyj.xml16.controller;

import com.gilxyj.xml16.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: xml16
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-17 23:16
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
      return   helloService.hello("gilbertxiao");
    }

}
