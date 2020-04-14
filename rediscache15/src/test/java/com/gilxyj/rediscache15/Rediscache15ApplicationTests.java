package com.gilxyj.rediscache15;

import com.gilxyj.rediscache15.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Rediscache15ApplicationTests {


    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
       /* System.out.println(">>>>"+userService.getUserById(99L,"gilxyj"));
        System.out.println(">>>>"+userService.getUserById(99L,"gaoyuting"));*/


       /* System.out.println(">>>>"+userService.getUserById(99L,"gilxyj","100"));
        System.out.println(">>>>"+userService.getUserById(99L,"gaoyuting","100"));*/

        /*System.out.println(">>>>"+userService.getUserById(99L));
        System.out.println(">>>>"+userService.getUserById(99L));
        userService.updateUserById(99L);
        System.out.println("++++"+userService.getUserById(99L));
        System.out.println("++++"+userService.getUserById(99L));*/


        System.out.println(">>>>"+userService.getUserById(99L));
        System.out.println(">>>>"+userService.getUserById(99L));
        userService.deleteUserById(99L);
        System.out.println("++++"+userService.getUserById(99L));
        System.out.println("++++"+userService.getUserById(99L));
    }

}
