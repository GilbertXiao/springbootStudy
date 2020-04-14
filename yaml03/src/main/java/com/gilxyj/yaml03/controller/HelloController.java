package com.gilxyj.yaml03.controller;

import com.gilxyj.yaml03.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: yaml03
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-22 23:39
 **/
@RestController
public class HelloController {

    @Autowired
    Book book;


    @GetMapping("/hello")
    public String hello(){
        return book.toString();
    }


    @GetMapping("/hello2")
    public String hello2(){

        return book.toString();
    }
}
