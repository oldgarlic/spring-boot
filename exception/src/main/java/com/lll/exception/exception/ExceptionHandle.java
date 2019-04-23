package com.lll.exception.exception;

import com.lll.exception.pojo.Result;
import com.lll.exception.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@Slf4j
public class ExceptionHandle {
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof MyException){
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getCode(),myException.getMsg());
        }else{
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
