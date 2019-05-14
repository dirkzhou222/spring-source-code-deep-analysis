package com.kdyzm.spring.helloworld.JUC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VolatileExample {
    private int a = 0;
    private volatile boolean flag = false;
    public void writer(){
        a = 1;          //1
        flag = true;   //2
    }
    public void reader(){
        int i = 0;
        if(flag){      //3
            i = a;
        }
        System.out.println(i);
    }

    public static void main(String[] args) {

        VolatileExample ve = new VolatileExample();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ve.writer();
            }
        });
        for(int i = 0;i<10;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    ve.reader();
                }
            });
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }




//        executor.shutdown();






    }



}