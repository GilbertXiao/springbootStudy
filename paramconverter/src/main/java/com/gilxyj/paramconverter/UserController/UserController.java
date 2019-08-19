package com.gilxyj.paramconverter.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: paramconverter
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-19 21:38
 **/
@RestController
public class UserController {

    @GetMapping("/hello")
    public void hello(Date birthdate){

        System.out.println(birthdate);

    }
}
