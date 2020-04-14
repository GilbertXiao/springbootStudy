package com.gilxyj.redis14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Redis14ApplicationTests {


    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;



    @Test
    public void contextLoads() {

        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "gaoyuting");
        Object name = valueOperations.get("name");
        System.out.println(name);
    }

}
