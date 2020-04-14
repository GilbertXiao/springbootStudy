package com.gilxyj.jpa26;

import com.gilxyj.jpa26.bean.Book;
import com.gilxyj.jpa26.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jpa26ApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    public void contextLoads() {

        Book book = new Book();
        book.setName("gilxyj");
        book.setAuthor("gilxyj");
        bookDao.save(book);
    }

    @Test
    public void update(){
        Book book = new Book();
        book.setName("三国演义");
        book.setAuthor("黄晓明");
        book.setId(3);
        bookDao.saveAndFlush(book);
    }

    @Test
    public void deleteById(){

        bookDao.deleteById(1);
    }

    @Test
    public void find1(){
        Optional<Book> byId = bookDao.findById(2);
        System.out.println(byId);

        List<Book> all = bookDao.findAll();
        System.out.println(all);
    }

    @Test
    public  void find2(){
        List<Book> id = bookDao.findAll(new Sort(Sort.Direction.DESC, "id"));
        System.out.println(id);
    }

    @Test
    public void find3(){
        PageRequest of = PageRequest.of(0, 2);

        Page<Book> all = bookDao.findAll(of);
        System.out.println("总记录数"+all.getTotalElements());
        System.out.println("当前页记录数"+all.getNumberOfElements());
        System.out.println("每页记录数"+all.getSize());
        System.out.println("获取总页数"+all.getTotalPages());
        System.out.println("获取结果"+all.getContent());

    }

    @Test
    public void find4(){

        Book bookById = bookDao.findBookById(3);

        System.out.println(bookById);

        List<Book> gil = bookDao.findBookByNameContaining("gil");
        System.out.println(gil);

    }


    @Test
    public void find5(){

        Book bookById = bookDao.getMaxId();

        System.out.println(bookById);

    }

    @Test
    public void find6(){

        bookDao.addBook("高玉婷111", "goodjob");

        bookDao.addBook2("肖榆杰", "666");
    }

}
