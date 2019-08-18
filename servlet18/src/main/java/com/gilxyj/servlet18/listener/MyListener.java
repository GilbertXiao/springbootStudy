package com.gilxyj.servlet18.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: servlet18
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-18 23:05
 **/
@WebListener
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener>>>>requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener>>>>requestInitialized");
    }
}
