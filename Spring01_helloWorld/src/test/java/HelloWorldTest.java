
import biz.HelloWorld;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-04 15:31
 */
public class HelloWorldTest extends TestCase {
    private ApplicationContext ac;

    @Override
    @Before
    protected void setUp() throws Exception {
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
    }
    @Test
    public void testHello(){
        HelloWorld hw= (HelloWorld) ac.getBean("helloWorld");
        hw.hello();
    }
}
