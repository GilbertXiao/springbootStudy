package com.gilxyj.javassm01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilxyj.javassm01.bean.User;

/**
 * @program: javassm01
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-20 22:42
 */
@RestController
public class UserController {
    @GetMapping("/getuser")
    public User getUser() {
        User user = new User();

        user.setName("gaoyuting");
        user.setId(1L);

        return user;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
