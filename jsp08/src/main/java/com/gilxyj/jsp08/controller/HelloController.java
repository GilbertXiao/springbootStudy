package com.gilxyj.jsp08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: jsp08
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-30 22:26
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){

        List<String> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add("gilbertxiao"+i);

        }
        model.addAttribute("items", objects);
        return "hello";
    }
}
