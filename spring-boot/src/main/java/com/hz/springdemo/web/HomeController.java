package com.hz.springdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hz on 2016/7/10.
 */
@Controller
public class HomeController {

    @Autowired
    ApplicationArguments args;

    @Value("${my.name}")
    String myName;

    @Value("${my.secret}")
    String secret;

    @RequestMapping("/")
    String home(){
        StringBuilder sb =new StringBuilder();
        List<String> files = args.getNonOptionArgs();
        boolean debug = args.containsOption("debug");
        sb.append("secret:"+ secret + "</br>");
        sb.append("debug:" + debug + "</br>");
//        files.forEach(item -> sb.append(item + "</br>"));
        return "Hello Spring boot!<br/> name:"+ myName  +"<br/>" + sb.toString();
    }

    @RequestMapping("/info")
    String info(){
        return "info";
    }



    @RequestMapping("/errordemo")
    String errorDemo(){
        int a = 10;
        int b = 0;
        int c = a / b;
        return "error";
    }


    @ExceptionHandler(value = ArithmeticException.class)
    public String nfeHandler(ArithmeticException e){
//        return e.getMessage();
        return "customerror";
    }


}
