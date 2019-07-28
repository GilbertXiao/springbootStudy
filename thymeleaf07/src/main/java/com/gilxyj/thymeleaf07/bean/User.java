package com.gilxyj.thymeleaf07.bean;

/**
 * @program: thymeleaf07
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-28 23:19
 **/
public class User {

    private Integer id;
    private String username;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
