package com.gilxyj.rediscache15.service;

import com.gilxyj.rediscache15.bean.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @program: rediscache15
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-07 22:17
 **/
@Service
@EnableCaching
@CacheConfig(cacheNames = "c1")
public class UserService {

    @Cacheable
    public User getUserById(Long id){
        System.out.println(id);
        User user = new User();
        user.setId(id);
        return user;
    }




   /* @Cacheable(cacheNames = "c1")
     public User getUserById(Long id,String name){
        System.out.println(id);
        User user = new User();
        user.setId(id);
        return user;
    }*/

   /* @Cacheable(keyGenerator = "myKeyGenerator")*/
 /*   public User getUserById(Long id,String name,String age){
        System.out.println(id);
        User user = new User();
        user.setId(id);
        return user;
    }*/

    @CachePut
    public User updateUserById(Long id){
        User user = new User();
        user.setId(id);
        user.setUsername("gaoyuting");
        return user;
    }

    @CacheEvict
    public void deleteUserById(Long id){
        System.out.println("delete user by id>>"+id);
    }


}
