package mini;

import huwei.Measurable;
import org.springframework.stereotype.Component;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 10:06
 */
@Component
public class PersonBmiTool implements Measurable {

    @Override
    public double measure(Object obj) {
        if(obj==null){
            return 0;
        }
        if(!(obj instanceof  Person)){
            return 0;
        }
        Person p=(Person) obj;
        double bmi=p.getWeight()/(p.getHeight()*p.getHeight());
        return bmi;
    }
}
