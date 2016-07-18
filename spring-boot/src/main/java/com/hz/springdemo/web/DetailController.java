package com.hz.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hz on 2016/7/18.
 */
@Controller
public class DetailController {
    @RequestMapping("/detail")
    public String detail(){
        throw new NullPointerException("obj is null");
    }
}
