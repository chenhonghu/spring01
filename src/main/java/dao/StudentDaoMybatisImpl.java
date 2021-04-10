package dao;

import org.springframework.stereotype.Repository;
import sun.misc.Contended;

import java.util.Random;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-04 14:47
 */
@Repository
public class StudentDaoMybatisImpl implements StudentDao {
    @Override
    public int add(String name) {
      System.out.println("mybatis 添加学生："+name);
        Random r=new Random();
        return r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("mybaties更新学生："+name);
    }
}
