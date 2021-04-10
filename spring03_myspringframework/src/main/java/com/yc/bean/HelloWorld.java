package com.yc.bean;


import com.yc.springframework.stereotype.MyPostConstruct;
import com.yc.springframework.stereotype.MyPreDestroy;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:02
 */

public class HelloWorld {
    @MyPostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }
    @MyPreDestroy
    public void destroy(){
        System.out.println("MyPreDestroy");
    }
    public HelloWorld(){
        System.out.println("hello wordl 构造");
    }
    public void show(){
        System.out.println("show");
    }
}
