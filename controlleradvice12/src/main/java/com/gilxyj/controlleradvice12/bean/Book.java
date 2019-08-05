package com.gilxyj.controlleradvice12.bean;

/**
 * @program: controlleradvice12
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-05 23:21
 **/
public class Book {

    private String name;
    private long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
