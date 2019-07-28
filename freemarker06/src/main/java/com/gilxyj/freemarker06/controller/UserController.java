package com.gilxyj.freemarker06.controller;

import com.gilxyj.freemarker06.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: freemarker06
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-28 12:10
 **/

@Controller
public class UserController {

    @GetMapping("/index")
    public String index(Model model){
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("张三"+i);
            user.setAddress("深圳"+i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);

        return "index";

    }
}
