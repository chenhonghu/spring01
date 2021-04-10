package com.yc.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-10 16:23
 */
@Aspect
@Component
@Order(value=10)
public class Log2Aspectj {
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.add*(..))")
    private void add(){

    }
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.update*(..))")
    public void update(){

    }
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    private void find(){

    }

    @Pointcut("add()||update()")
    private void addAndUpdate(){

    }
    @Before(("com.yc.aspectj.Log2Aspectj.addAndUpdate()"))
    public void log(){
    System.out.print("+++++++++++++++前置增强的日志+++++++++++++++++");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr=sdf.format(d);
        System.out.print("执行时间+"+dstr);
        System.out.print("+++++++++++++++前置增强的日志结束+++++++++++++++++");
        System.out.print("==================log2==================");
    }
}
