package com.kdyzm.spring.helloworld.eventMulticaster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dirk
 * @CreateDate: 2019-04-20 11:42
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/kdyzm/spring/helloworld/eventMulticaster/application.xml");
        TestEvent testEvent = new TestEvent("hello","msg");
        context.publishEvent(testEvent);
    }
}
