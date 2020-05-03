package com.gilxyj.controlleradvice12.handler;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: controlleradvice12
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-05 00:00
 **/
@ControllerAdvice
public class GlobalDataController {

    @ModelAttribute("md")
    public Map<String,String> globalUserData(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("gender", "man");
        return  map;
    }

    @InitBinder("bok")
    public void bindBook(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("author")
    public void bindAuthor(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }

}
