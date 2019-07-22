package com.gilxyj.yaml03.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: yaml03
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-22 23:43
 **/

@ConfigurationProperties(prefix = "book")
@Component
public class Book {

    private String name;
    private String author;

    private List<String> fans;

    private List<Buyer> buyers;

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public List<String> getFans() {
        return fans;
    }

    public void setFans(List<String> fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", fans=" + fans +
                ", buyers=" + buyers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
