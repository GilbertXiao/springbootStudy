package com.gilxyj.rediscache15.bean;

import java.io.Serializable;

/**
 * @program: rediscache15
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-07 22:15
 **/
public class User implements Serializable {

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


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
