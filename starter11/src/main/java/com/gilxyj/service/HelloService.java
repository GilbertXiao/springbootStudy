package com.gilxyj.service;

/**
 * @program: starter11
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 22:06
 **/
public class HelloService {

    private String msg;
    private String name;

    public String sayHello(){
        return name+" say:"+msg ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
