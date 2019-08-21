package com.gilxyj.jdbctemplate22;

import com.gilxyj.jdbctemplate22.bean.Book;
import com.gilxyj.jdbctemplate22.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Jdbctemplate22ApplicationTests {

    @Autowired
    BookService bookService;

    @Test
    public void contextLoads() {
        Book book = new Book();
        book.setName("gilxyj");
        book.setAuthor("小雨姐");
        bookService.addBook(book);
    }

    @Test
    public void contextLoads1() {
        Book book = new Book();
        book.setName("gilxyj");
        book.setAuthor("小雨姐");
        book.setId(1);
        bookService.updateBook(book);
    }

    @Test
    public void contextLoads2() {

        bookService.deleteBookById(2);
    }

    @Test
    public void contextLoads3() {

        Book bookById = bookService.getBookById(1);

        System.out.println(bookById);

    }

    @Test
    public void contextLoads4() {

        List<Book> books = bookService.getBooks();

        System.out.println(books);
    }

    @Test
    public void contextLoads5() {

        Book bookById = bookService.getBookById1(1);

        System.out.println(bookById);

    }

}
