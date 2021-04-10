package com.yc.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyComponentScan {
String []basePackages() default {};
}
