package com.kdyzm.spring.helloworld.eventMulticaster;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: dirk
 * @CreateDate: 2019-04-20 11:36
 */
public class TestEvent extends ApplicationEvent{

    public String msg;


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }



    public void print(){
        System.out.println(msg);
    }



}
