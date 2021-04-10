
package huwei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 09:41
 */
@Component
public class Container {
    public static final int LENGTH=5;

    private Object []objs=new Object[LENGTH];
    private int count;
    private Object max;
    private Object min;
    private double avg;
    private double sum;

    private Measurable measurable;
    private double objvalue;
    public double getObjvalue(){
        return this.objvalue;
    }
    public Object[] getObjs(){
        Object newojbs=new Object[count];
        System.arraycopy(objs,0,newojbs,0,count);
        return objs;
    }
    @Autowired
    public void setMeasurable(Measurable measurable){
    this.measurable=measurable;

    objs=new Object[LENGTH];
    count=0;
    max=null;
    min=null;
    avg=0;


    }
    public Object getMax(){
        return this.max;
    }
    public Object getMin(){
        return this.min;
    }
    public double getAVg(){
        return this.avg;
    }
    public void save(Object object){

    }
}
