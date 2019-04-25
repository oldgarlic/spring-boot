package com.lll.interceptor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("hi")
    public String testController(){
        System.out.println("我正在处理请求");
        return "这是一个拦截器测试类";
    }
}
