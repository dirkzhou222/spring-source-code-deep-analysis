package com.kdyzm.spring.helloworld.eventMulticaster;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author: dirk
 * @CreateDate: 2019-04-20 11:39
 */
public class TestListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof TestEvent){
            TestEvent testEvent = (TestEvent) event;
            testEvent.print();
        }
    }
}
