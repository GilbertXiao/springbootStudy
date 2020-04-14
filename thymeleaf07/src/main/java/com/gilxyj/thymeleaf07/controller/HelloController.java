package com.gilxyj.thymeleaf07.controller;

import com.gilxyj.thymeleaf07.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: thymeleaf07
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-28 23:21
 **/
@Controller
public class HelloController {

    @GetMapping("/index")
    public String index(Model model){

        List<User> users=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("gaoyuting"+i);
            user.setAddress("深圳"+i);
            users.add(user);

        }
        model.addAttribute("users", users);
        return "index";

    }
}
