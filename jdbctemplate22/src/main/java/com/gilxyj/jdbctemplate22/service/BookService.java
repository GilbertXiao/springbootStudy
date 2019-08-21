package com.gilxyj.jdbctemplate22.service;

import com.gilxyj.jdbctemplate22.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: jdbctemplate22
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-21 00:05
 **/
@Service
public class BookService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Integer addBook(Book book){
        return jdbcTemplate.update("insert into t_book(author,name) values(?,?) ",book.getAuthor(),book.getName());

    }

    public Integer updateBook(Book book){
        return jdbcTemplate.update("update t_book set author=?,name=? where id =?", book.getAuthor(),book.getName(),book.getId());
    }

    public Integer deleteBookById(Integer id){

        return jdbcTemplate.update("delete from t_book where id= ?", id);
    }

    public Book getBookById1(Integer id){
        return jdbcTemplate.queryForObject("select * from t_book where id=?", new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                Book book = new Book();
                book.setId(id1);
                book.setAuthor(author);
                book.setName(name);
                return book;
            }
        }, id);
    }
    public Book getBookById(Integer id){
        return jdbcTemplate.queryForObject("select * from t_book where id=?", new BeanPropertyRowMapper<>(Book.class), id);
    }

    public List<Book> getBooks(){
        return jdbcTemplate.query("select * from t_book", new BeanPropertyRowMapper<>(Book.class));
    }


}
