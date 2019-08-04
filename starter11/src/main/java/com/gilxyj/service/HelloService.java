package com.gilxyj.service;

import com.gilxyj.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: starter11
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 22:06
 **/

public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(){
        return helloProperties.getName()+" say:"+helloProperties.getMsg() ;
    }


    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
