package com.gilxyj.jpasource27.controller;

import com.gilxyj.jpasource27.bean.Book;
import com.gilxyj.jpasource27.dao1.BookDao1;
import com.gilxyj.jpasource27.dao2.BookDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @program: jpasource27
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-26 22:53
 **/
@RestController
public class HelloController {

    @Autowired
    BookDao1 bookDao1;

    @Autowired
    BookDao2 bookDao2;

    @GetMapping("/test")
    public void test(){
        Book book = new Book();
        book.setAuthor("高小姐");
        book.setName("美美哒");
        bookDao1.save(book);

        Book book1 =new Book();
        book1.setName("厉害哒");
        book1.setAuthor("萧十一郎");
        bookDao2.save( book1);
    }
}
