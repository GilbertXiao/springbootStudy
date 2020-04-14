package com.gilxyj.mybatissource25.controller;

import com.gilxyj.mybatissource25.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mybatissource25
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-25 14:00
 **/
@RestController
public class HelloController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String getAllBook(){
        bookService.getAllBooks();
        return "success";
    }

}
