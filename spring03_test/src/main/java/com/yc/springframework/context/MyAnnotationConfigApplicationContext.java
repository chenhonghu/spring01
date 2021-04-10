package com.yc.springframework.context;

import com.yc.springframework.stereotype.MyComponent;
import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-08 20:52
 */
@MyComponent
public class MyAnnotationConfigApplicationContext {
private Map<String,Object> beanMap=new HashMap<String,Object>();
private Set<Class> managedBeanClasses=new HashSet<Class>();
public MyAnnotationConfigApplicationContext(Class<?>... componentClasses){
    try {
        register(componentClasses);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void register(Class<?>[] componentClasses) throws IllegalAccessException, InstantiationException {
    if(componentClasses==null||componentClasses.length<=0){
        throw new RuntimeException("没有指定配置类");
    }
    for(Class cl:componentClasses){
        if(!cl.isAnnotationPresent(MyConfiguration.class)){
            continue;
        }
        String []basePackages=getAppConfigBasePackages(cl);
        if(cl.isAnnotationPresent(MyComponentScan.class)){
            MyComponentScan msc= (MyComponentScan) cl.getAnnotation(MyComponentScan.class);
            if(msc.basePackages()!=null&&msc.basePackages().length>0){
                basePackages=msc.basePackages();
            }

        }
        Object obj= cl.newInstance();
    }

    }

    private String[] getAppConfigBasePackages(Class cl) {
    String[]paths =new String[1];
    paths[0]=cl.getPackage().getName();
    return paths;
    }
}
