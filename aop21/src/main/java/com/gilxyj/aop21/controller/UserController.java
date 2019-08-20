package com.gilxyj.aop21.controller;

import com.gilxyj.aop21.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: aop21
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-19 23:03
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test1")
    public String getUserNameByUserId(Integer id){
        return userService.getUserNameByUserId(1);
    }

    @GetMapping("/test2")
    public void deleteUserById(Integer id){
        userService.deleteUserById(1);
    }

}
