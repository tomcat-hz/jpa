package com.hz.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *   设置访问首页index.jsp
 *   @Configuration 实例化此类，项目在启动过程中读取的配置
 */
@Configuration
public class ToIndexView extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {//
        registry.addViewController( "/" ).setViewName( "index" );
        registry.addViewController( "/icon" ).setViewName( "icon" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }
}
