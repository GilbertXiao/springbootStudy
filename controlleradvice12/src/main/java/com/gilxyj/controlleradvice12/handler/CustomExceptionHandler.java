package com.gilxyj.controlleradvice12.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: controlleradvice12
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-04 22:50
 **/
@ControllerAdvice
public class CustomExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public ModelAndView customException(Exception e){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("customTitle","哎呀呀");
        modelAndView.addObject("customException",e.getMessage());

        modelAndView.setViewName("CustomException");

        return modelAndView;

    }
}
