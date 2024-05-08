package com.longlong.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

// 返回字符串
@RestController

// 返回页面
// @Controller
public class TestController {
    /**
     * GET, POST, PUT, DELETE
     * @return
     */
    // 支持所有请求方式
//    @RequestMapping("/hello")
    @GetMapping("/hello")
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)

//    @PostMapping
//    @PutMapping
//    @DeleteMapping
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post,"+ name;
    }

}
