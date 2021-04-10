import huwei.Container;
import mini.Person;
import mini.PersonBmiTool;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.Random;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ContainerTest {
     @Autowired
    private Container c;
    @Autowired
    private Random r;
    @Autowired
    private PersonBmiTool pbt;


    @Test
    public void testSave(){
        Person p1=new Person("张三",1.71,81);
        Person p2=new Person("张4",1.72,82);
        Person p3=new Person("张5",1.73,83);
        Person p4=new Person("张6",1.74,84);
        Person p5=new Person("张7",1.75,85);
        Person p6=new Person("张8",1.76,86);

        c.save(p1);
        c.save(p2);
        c.save(p3);
        c.save(p4);
        c.save(p5);
        c.save(p6);
        for(int i=0;i<1000;i++){
            Person p7=new Person("wangba"+i,1+Math.random(),r.nextInt(80));
        }
        Person max= (Person) c.getMax();
        Person min= (Person) c.getMin();
        System.out.println("最小值"+min.getClass().getName());
        System.out.println("最大值"+max.getClass().getName());

        System.out.println("平均值"+c.getAVg());

        Object []objs =c.getObjs();
        for(Object o:objs ){
            Person pp= (Person) o;
            System.out.println(pp.getClass().getName());
        }
    }
}
