package com.yc;

import com.yc.bean.HelloWorld;
import com.yc.springframework.stereotype.MyBean;
import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-08 20:56
 */
@MyConfiguration
@MyComponentScan(basePackages={"com.com.com.yc.biz","com.com.com.yc.dao"})
public class MyAppConfig {
    @MyBean
    public HelloWorld hw(){
        return new HelloWorld();
    }
    @MyBean
    public  HelloWorld hw2(){
        return new HelloWorld();
    }
}
