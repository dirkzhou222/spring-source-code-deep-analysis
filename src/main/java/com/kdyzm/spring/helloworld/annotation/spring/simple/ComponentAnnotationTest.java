package com.kdyzm.spring.helloworld.annotation.spring.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentAnnotationTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
    annotationConfigApplicationContext.register(ComponentAnnotationTest.class);
    annotationConfigApplicationContext.refresh();
    InjectClass injectClass = annotationConfigApplicationContext.getBean(InjectClass.class);
    injectClass.print();
  }

  @MyComponent
  public  class InjectClass {
    public void print() {
      System.out.println("hello world");
    }
  }

}