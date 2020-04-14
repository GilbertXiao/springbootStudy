package com.gilxyj.mybatisjpa28.mapper;

import com.gilxyj.mybatisjpa28.bean.Book;

import java.util.List;

public interface BookMapper {

    List<Book> getAllBooks();

    Integer addBook(Book book);
}
