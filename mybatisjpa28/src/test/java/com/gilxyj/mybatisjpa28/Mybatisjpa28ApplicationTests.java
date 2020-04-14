package com.gilxyj.mybatisjpa28;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gilxyj.mybatisjpa28.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Mybatisjpa28ApplicationTests {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test01() throws JsonProcessingException {

        Book book = new Book();
        book.setName("aaa");
        book.setAuthor("bbbb");

        ResponseEntity<Book> bookResponseEntity = testRestTemplate.postForEntity("/book", book, Book.class);
        System.out.println(bookResponseEntity.getBody());
    }

}
