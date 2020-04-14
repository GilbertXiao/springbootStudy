package com.gilxyj.commandline13.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: commandline13
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-06 22:18
 **/
@Component
@Order(99)
public class CommandLineRunner01 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i+":"+args[i]);
        }
        System.out.println("CommandLineRunner01>>>"+ Arrays.toString(args));
    }
}
