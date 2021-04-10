import dao.StudentBizImpl;
import dao.StudentDao;
import dao.StudentDaoJpalmpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-04 14:49
 */
public class StudentDaoTest  {
  //  private StudentDao studentDao;
//  private StudentBizImpl studentBizImpl;
  private ApplicationContext ac;
  private StudentBizImpl studentBiz;

  @Before
  protected void setUp() throws Exception {
    ac = new AnnotationConfigApplicationContext();
    studentBiz= (StudentBizImpl) ac.getBean("studentBizImpl");
//    studentDao=new StudentDaoJpalmpl();
//    studentBizImpl=new StudentBizImpl();
//    studentBizImpl.setStudentDao(studentDao);
  }

  @Test
  public void testAdd() {
    studentBiz.add("李四");
  }
  @Test
  public void testUpdate(){
    studentBiz.add("李四");
  }
}

