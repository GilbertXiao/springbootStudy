package com.gilxyj.mybatis24.controller;

import com.gilxyj.mybatis24.bean.Book;
import com.gilxyj.mybatis24.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mybatis24
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-24 23:12
 **/
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public List<Book> hello(){
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println(allBooks);
        return allBooks;
    }
}
