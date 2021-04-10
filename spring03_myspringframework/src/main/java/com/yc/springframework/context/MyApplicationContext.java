package com.yc.springframework.context;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:03
 */
public interface MyApplicationContext {
    public Object getBean(String id);
}
