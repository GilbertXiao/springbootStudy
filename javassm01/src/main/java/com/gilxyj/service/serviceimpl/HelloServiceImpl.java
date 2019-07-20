package com.gilxyj.service.serviceimpl;

import com.gilxyj.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @program: javassm01
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-20 21:56
 **/

@Service
public class HelloServiceImpl  implements HelloService {

    public String hello() {
        return "hello Springmvc from service!";
    }
}
