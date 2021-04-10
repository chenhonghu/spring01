package com.yc.dao;

import com.yc.springframework.stereotype.MyRepositroy;

import java.util.Random;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-07 20:14
 */
@MyRepositroy
public class StudentDaoMybatisImpl implements  StudentDao{
    @Override
    public int add(String name) {
        System.out.println("mybatis添加学生：" + name);
        Random r = new Random();
        return r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("mybatis更新学生：" + name);
    }
}
