package com.hz.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ServiceExceptionHandler {
    /**
     * 可以处理所有 Controller 中抛出的 CustomServiceException 的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(CustomServiceException.class)
    @ResponseBody
    public RespBean serviceHandler(CustomServiceException e) {
        RespBean respBean = RespBean.fail(e.getCode(), e.getMsg());
        return respBean;
    }
}