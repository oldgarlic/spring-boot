package com.lll.interceptor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("hi")
    public String testController(){
        return "这是一个聚合工程";
    }
}
