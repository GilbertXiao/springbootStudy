package com.gilxyj.mybatisjpa28.controller;

import com.gilxyj.mybatisjpa28.bean.Book;
import com.gilxyj.mybatisjpa28.dao.BookDao;
import com.gilxyj.mybatisjpa28.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mybatisjpa28
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-26 21:54
 **/
@RestController
public class HelloController {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BookDao bookDao;

    @GetMapping("/test")
    public void test(){
        List<Book> allBooks = bookMapper.getAllBooks();
        System.out.println(allBooks);

        Book bookById = bookDao.findBookById(3);
        System.out.println(bookById);
    }

    @GetMapping("/add")
    public void add(){
        Book book = new Book();
        book.setAuthor("大神加油");
        book.setName("无敌大圣");
        Integer integer = bookMapper.addBook(book);
        System.out.println(integer);


        Integer integer1 = bookDao.addBook("天龙八部", "金庸");
        System.out.println(integer1);
    }
}
