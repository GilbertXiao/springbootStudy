package com.gilxyj.errorview09.serviceimpl;

import com.gilxyj.javassm01.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @program: errorview09
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 22:43
 **/
@Component
public class HelloChangeService extends HelloService {


    @Override
    public String sayHello() {
        return getHelloProperties().getName()+" dont't say:" +getHelloProperties().getMsg();
    }
}
