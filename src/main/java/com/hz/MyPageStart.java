package com.hz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   前台登陆模块启动类
 */
@SpringBootApplication(scanBasePackages = "com.hz.*")
public class MyPageStart {

    public static void main(String[] args) {
        SpringApplication.run(MyPageStart.class);
    }

}
