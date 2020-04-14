package com.gilxyj.mybatis24.mapper;

import com.gilxyj.mybatis24.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;


public interface BookMapper {

    List<Book> getAllBooks();
}
