package com.gilxyj.jdbctemplatesources23.controller;

import com.gilxyj.jdbctemplatesources23.bean.Book;
import com.gilxyj.jdbctemplatesources23.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: jdbctemplatesources23
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-22 00:23
 **/
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public List<Book> hello(){
        return bookService.getBooks();
    }
}
