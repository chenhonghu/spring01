package com.yc.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-08 20:46
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyPostConstruct {
}
