package com.yc.biz;

import com.yc.MyAppConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyAppConfig.class)
public class Test01 {
    @Autowired
    StudentBiz biz;
    @Test
    public void testAdd() {

    biz.add("asd");
    }
    @Test
    public void testUpdate() {
    biz.update("asd");
    }
    @Test
    public void testFind() {
    biz.add("asd");
    }
}