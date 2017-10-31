package com.miao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("hello world");
        return "hello world";

    }
}
