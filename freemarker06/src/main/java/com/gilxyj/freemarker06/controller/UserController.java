package com.gilxyj.freemarker06.controller;

import com.gilxyj.freemarker06.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
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
    public String index(Model model, HttpServletRequest request){
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("张三"+i);
            user.setAddress("深圳"+i);
            userList.add(user);
        }

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("李四"+i);
            user.setAddress("广州"+i);
            users.add(user);
        }
      model.addAttribute("userList", userList);
        request.setAttribute("user",users);

        return "index";

    }
}
