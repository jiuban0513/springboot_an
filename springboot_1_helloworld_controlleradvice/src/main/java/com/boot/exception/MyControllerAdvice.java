package com.boot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局捕获异常，只要有@RequestMapping方法上，所有的异常信息都会被捕捉到。
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> errorHandle(Exception ex){
        Map<String, Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg",ex.getMessage());
        return map;
    }

    /**
     * 自定义异常捕捉
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyBusinessException.class)
    public Map<String,Object> errorHandle(MyBusinessException ex){
        Map<String, Object> map = new HashMap<>();
        map.put("code",ex.getCode());
        map.put("msg",ex.getMsg());
        return map;
    }

}
