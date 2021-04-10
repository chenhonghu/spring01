package com.yc.springframework.context;

import com.yc.springframework.stereotype.MyService;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-08 20:44
 */
@MyService
public interface MyApplicationContext {
    public Object getBean(String id) ;
}
