package com.longlong.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// 返回字符串
@RestController

// 返回页面
// @Controller
public class TestController {

    @Value("${test.hello}")
    private String testHello;
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
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post,"+ name;
    }

}
