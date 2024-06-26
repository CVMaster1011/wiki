package com.longlong.wiki.controller;

import com.longlong.wiki.domain.Demo;
import com.longlong.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// 返回字符串
@RestController

// 返回页面
// @Controller
@RequestMapping("/demo")
public class DemoController {


    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){ return demoService.list();}

}
