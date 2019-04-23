package com.kdyzm.spring.helloworld.annotation.spring.customAnnotation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomizeComponent {
     String value() default "";
}