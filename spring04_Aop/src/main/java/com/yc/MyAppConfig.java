package com.yc;

import com.yc.bean.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:07
 */
@Configuration
@ComponentScan(basePackages={"com.yc"})
@EnableAspectJAutoProxy
public class MyAppConfig {
    @Bean
    public HelloWorld hw(){
        return new HelloWorld();
    }
    @Bean
   public  HelloWorld hw2(){
        return new HelloWorld();
    }
}
