package com.yc.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 14:07
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
}
