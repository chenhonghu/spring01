package biz;

import org.springframework.stereotype.Component;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-04 15:30
 */
@Component
public class HelloWorld {
    public HelloWorld(){
        System.out.println("无参构造方法");
    }
    public void hello(){
        System.out.println("hello world");
    }
}
