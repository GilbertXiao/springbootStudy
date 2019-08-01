package com.gilxyj.errorview09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: errorview09
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-30 23:14
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        int i=10/0;
        return "hello";
    }
}
