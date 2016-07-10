package com.hz.springdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hz on 2016/7/10.
 */
@RestController
public class HomeController {

    @Autowired
    ApplicationArguments args;

    @RequestMapping("/")

    String home(){
        StringBuilder sb =new StringBuilder();
        List<String> files = args.getNonOptionArgs();
        boolean debug = args.containsOption("debug");
        sb.append("debug:" + debug);
        files.forEach(item -> sb.append(item + "</br>"));
        return "Hello Spring boot!<br/> " + sb.toString();
    }
}
