package com.hz.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by hz on 2016/7/10.
 */
@Component
public class CommandLineRunnerDean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        int arg1 = args.length;
        System.out.println("CommandLineRunnerDean:Info--------" + arg1);
    }
}
