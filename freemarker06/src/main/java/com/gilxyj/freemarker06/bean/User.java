package com.gilxyj.freemarker06.bean;

/**
 * @program: freemarker06
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-28 11:58
 **/
public class User {

    private Long id;
    private String username;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
