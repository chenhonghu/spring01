package com.yc.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-10 16:06
 */
@Aspect
@Component
@Order(value=1)
public class LogAspectj {
 @Pointcut("execution(* com.yc.biz.StudentBizImpl.add*(..))")
 private void add(){

 }
 @Pointcut("execution(* com.yc.biz.StudentBizImpl.update*(..))")
    private void update(){

 }
 @Pointcut("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    private void find(){

 }

 @Pointcut("add()||update()")
    private void addAndUpdate(){

 }
@Before("com.yc.aspectj.LogAspectj.addAndUpdate()")
    public void log(){
     System.out.print("=========前置增强============");
     Date d=new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String str=simpleDateFormat.format(d);
    System.out.print("执行时间为"+str);
    System.out.print("=========前置增强结束============");
 }
@After("com.yc.aspectj.LogAspectj.addAndUpdate()")
    public void bey(JoinPoint jp){
    System.out.print("=========bey============");
    Object target=jp.getTarget();
    System.out.print("目标类为"+target);
    Object method=jp.getSignature();
    System.out.print("方法为："+method);

    Object []objs=jp.getArgs();
    if(objs!=null){
        for(Object o:objs){
            System.out.print("参数"+o);
        }
    }
    System.out.print("=========bey============");
 }
 @Around("find()")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
     System.out.print("进到了 增强了...");
     long start=System.currentTimeMillis();
     Object reVal=pjp.proceed();
     Long end=System.currentTimeMillis();
     System.out.print("find运行时间"+(end-start));
     System.out.print("退出 增强了。。。。");
     return reVal;
 }
}
