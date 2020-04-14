package com.gilxyj.mybatissource25.service;

import com.gilxyj.mybatissource25.bean.Book;
import com.gilxyj.mybatissource25.mapper1.BookMapper;
import com.gilxyj.mybatissource25.mapper2.BookMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mybatissource25
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-25 13:52
 **/
@Service
public class BookService {


    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookMapper2 bookMapper2;

    public void getAllBooks(){
        List<Book> allBooks = bookMapper.getAllBooks();

        List<Book> allBooks1 = bookMapper2.getAllBooks();
        System.out.println(allBooks);
        System.out.println(allBooks1);
    }
}
