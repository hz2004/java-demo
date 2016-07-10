package com.hz.springdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hz on 2016/7/10.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    String home(){
        return "Hello Spring boot!<br/>";
    }
}
