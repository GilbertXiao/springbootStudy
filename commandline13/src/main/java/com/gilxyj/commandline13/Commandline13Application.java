package com.gilxyj.commandline13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Commandline13Application {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i+":"+args[i]);
        }
        SpringApplication.run(Commandline13Application.class, args);
    }

}
