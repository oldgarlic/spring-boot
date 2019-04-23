package com.lll.exception.controller;

import com.lll.exception.enums.ResultEnum;
import com.lll.exception.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionContoller {

    @GetMapping("hi/{id}")
    public String exceptionTest(@PathVariable Integer id){
        //模拟业务逻辑
        if(id == 1){
            throw new MyException(ResultEnum.SUCCESS);
        }else {
            throw new MyException(ResultEnum.UNKNOW_ERROR);
        }
    }
}
