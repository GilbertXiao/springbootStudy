package com.gilxyj.jdbctemplatesources23.service;

import com.gilxyj.jdbctemplatesources23.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: jdbctemplatesources23
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-22 00:16
 **/
@Service
public class BookService {


    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;

    @Resource(name="jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;


    public List<Book> getBooks(){
        List<Book> queryOne = jdbcTemplateOne.query("select * from t_book", new BeanPropertyRowMapper<>(Book.class));
        List<Book> queryTwo = jdbcTemplateTwo.query("select * from t_book", new BeanPropertyRowMapper<>(Book.class));
        System.out.println(queryOne);
        System.out.println(queryTwo);
        return queryOne;
    }
}
