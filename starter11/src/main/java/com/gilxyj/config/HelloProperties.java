package com.gilxyj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.xml.bind.annotation.XmlType;

/**
 * @program: starter11
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-02 22:00
 **/
@ConfigurationProperties(prefix = "gilxyj")
public class HelloProperties {

    private static final String DEFAULT_NAME="xiaoyujie";

    private static final String DEFAULT_MSG="love you";

    private String name=DEFAULT_NAME;
    private String msg=DEFAULT_MSG;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
