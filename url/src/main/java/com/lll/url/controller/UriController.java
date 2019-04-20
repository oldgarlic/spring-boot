package com.lll.url.controller;

import com.lll.url.pojo.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class UriController {

    //@PathVariable
    //@RequestParam
    //@RequestBody


//  url:xxx/test/参数
    @GetMapping("/test/{name1}")
    public String test1(@PathVariable("name1") String name){
        return name;
    }

//  url:xxx?name=值&age=值
    @GetMapping("test")
    public String test2(@RequestParam("name")String name){
        return name;
    }

//  url:xxx  参数为json字符串  POST
    @PostMapping("test")
    public Person test3(@RequestBody Person person){
        return person ;
    }
}
