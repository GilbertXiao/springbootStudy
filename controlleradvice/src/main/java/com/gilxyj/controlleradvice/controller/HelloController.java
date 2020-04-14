package com.gilxyj.controlleradvice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: controlleradvice
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-03 15:21
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public void hello(){
        int i=1/0;
    }
}
