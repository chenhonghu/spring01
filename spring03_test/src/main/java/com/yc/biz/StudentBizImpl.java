package com.yc.biz;

import com.yc.dao.StudentDao;
import com.yc.springframework.stereotype.MyAutowired;
import com.yc.springframework.stereotype.MyService;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-07 20:13
 */
@MyService
public class StudentBizImpl {
    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentBizImpl() {
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    @MyAutowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int add(String name) {
        System.out.println(" -------业务层------------");
        System.out.println("用户名是否重名");
        int result = studentDao.add(name);
        System.out.println("业务操作结束");
        return result;
    }

    public void update(String name) {
        System.out.println("=====业务层=====");
        System.out.println("用户名是否重名");
        studentDao.update(name);
        System.out.println("业务层结束");
    }
}
