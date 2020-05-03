package com.gilxyj.controlleradvice12.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @program: controlleradvice12
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-04 22:46
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public void hello(Model model) {
        Map<String, Object> stringObjectMap = model.asMap();
        System.out.println(stringObjectMap);
        int i=1/0;
    }
}
