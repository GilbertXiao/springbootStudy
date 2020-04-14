package com.gilxyj.mybatissource25.bean;

/**
 * @program: mybatissource25
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-25 13:02
 **/
public class Book {
    private Integer id;
    private String author;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
