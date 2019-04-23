package com.lll.exception.utils;

import com.lll.exception.pojo.Result;

public class ResultUtil {

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
