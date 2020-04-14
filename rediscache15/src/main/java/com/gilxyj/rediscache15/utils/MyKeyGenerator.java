package com.gilxyj.rediscache15.utils;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @program: rediscache15
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-07 23:42
 **/
@Component
public class MyKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        return method.getName()+ Arrays.toString(objects);
    }
}
