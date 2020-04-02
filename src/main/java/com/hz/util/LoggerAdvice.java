package com.hz.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggerAdvice {
    //
    @Before("within(com.hz..*) && @annotation(loggerManage)")
    public void addBeforeLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
//携带的操作信息
        String operator = loggerManage.logDescription();
//jdk8 提供的新的日期处理类
        LocalDateTime now = LocalDateTime.now();
        String beginTime = now.toString();
//把以上的信息构建一个对象，把对象存储到数据库，这样操作的日志就会在数据库中。
        System.out.println(now.toString() + "=============>执行[" + operator + "] 开始");
                System.out.println(joinPoint.getSignature().getName());
    }
}