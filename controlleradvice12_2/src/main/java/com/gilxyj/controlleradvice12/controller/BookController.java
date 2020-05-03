package com.gilxyj.controlleradvice12.controller;

import com.gilxyj.controlleradvice12.bean.Author;
import com.gilxyj.controlleradvice12.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: controlleradvice12
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-05 23:23
 **/
@Controller
public class BookController {

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @PostMapping("/doReg")
    public String doReg(Book book){

        System.out.println(book);
        return "reg";

    }


    @PostMapping("/doCommit")
    public String doReg(@ModelAttribute("bok") Book book, @ModelAttribute("author") Author author){

        System.out.println(book);
        System.out.println(author);

        return "reg";

    }
}
