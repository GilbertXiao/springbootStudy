package com.gilxyj.aop21.service;

import org.springframework.stereotype.Service;

/**
 * @program: aop21
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-19 23:01
 **/
@Service
public class UserService {

    public String getUserNameByUserId(Integer id){
        System.out.println("getUserNameByUserId" + id);
        return "getUserNameByUserId" +id;
    }

    public void deleteUserById(Integer id){
        System.out.println("deleteUserById" + id);
    }

}
