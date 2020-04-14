package com.gilxyj.javassm01.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.gilxyj.javassm01.service.HelloService;

/**
 * @program: javassm01
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-20 21:56
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello Springmvc from service!";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
