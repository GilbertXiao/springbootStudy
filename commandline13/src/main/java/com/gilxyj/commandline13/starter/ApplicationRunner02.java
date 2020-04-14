package com.gilxyj.commandline13.starter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @program: commandline13
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-06 22:38
 **/
@Component
@Order(96)
public class ApplicationRunner02 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("ApplicationRunner02>>>sourceArgs："+ Arrays.toString(sourceArgs));
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("ApplicationRunner02>>>nonOptionArgs："+ Arrays.toString(nonOptionArgs.toArray()));

        Set<String> optionNames = args.getOptionNames();
        for (String str:optionNames
             ) {
            List<String> optionValues = args.getOptionValues(str);
            System.out.println("ApplicationRunner02>>>optionValues："+str);
            System.out.println("ApplicationRunner02>>>optionValues："+ Arrays.toString(optionValues.toArray()));
        }
    }
}
