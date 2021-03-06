package com.miao.controller;

import com.miao.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by skf
 * Date 2017/10/31.
 */
//@@RestController 等于 @Controller +@ResponseBody
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

//    @RequestMapping("/hello")
//    public String hello() throws Exception {
//        System.out.println("hello world");
//        throw new Exception("发生错误");
//    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String  name ) throws Exception {
        System.out.println("hello world");
        return "hello"+name;
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
