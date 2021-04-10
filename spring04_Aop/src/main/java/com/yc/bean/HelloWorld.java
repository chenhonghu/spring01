package com.yc.bean;




import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:02
 */

public class HelloWorld {
    @PostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("MyPreDestroy");
    }
    public HelloWorld(){
        System.out.println("hello wordl 构造");
    }
    public void show(){
        System.out.println("show");
    }
    public void setHello(HelloWorld hello){
        System.out.print("@myResourceNameasd");
    }
}
