package com.gilxyj.mybatis24.service;

import com.gilxyj.mybatis24.bean.Book;
import com.gilxyj.mybatis24.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mybatis24
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-24 23:05
 **/
@Service
public class BookService {

   @Autowired
   BookMapper bookMapper;

   public List<Book> getAllBooks(){
      return  bookMapper.getAllBooks();
   }


}
