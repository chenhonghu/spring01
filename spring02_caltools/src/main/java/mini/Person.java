package mini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 10:05
 */
@Component
public class Person {
    private String name;
    private double height;
    private double weight;
    public Person(){

    }
    public Person(String name, double height, double weight) {

        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public double getHeight(){
       return this.height;
    }
    public double getWeight(){
        return this.weight;
    }

}
