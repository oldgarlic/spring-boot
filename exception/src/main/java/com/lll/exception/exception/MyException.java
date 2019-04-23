package com.lll.exception.exception;

import com.lll.exception.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyException extends RuntimeException{
    private Integer code;
    private String msg;

    public MyException(ResultEnum resultEnum){
        this.msg = resultEnum.getMsg();
        this.code = resultEnum.getCode();
    }
}
