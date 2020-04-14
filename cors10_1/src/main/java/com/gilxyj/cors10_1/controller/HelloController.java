package com.gilxyj.cors10_1.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: cors10_1
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-01 21:37
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "get Hello";
    }

    @PostMapping("/hello")
    public String hello2(){
        return "post hello";
    }


    @PutMapping("/hello")
    public String hello3(){
        return "put hello";
    }

    @DeleteMapping("/hello")
    public String hello4(){
        return "delete hello";
    }




}
