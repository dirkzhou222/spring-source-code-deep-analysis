package com.kdyzm.spring.helloworld.aopDirk;

import com.kdyzm.spring.helloworld.aware.TestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args)  {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kdyzm/spring/helloworld/aopDirk/test.xml");
		TestInterface testBean = (TestInterface) context.getBean("testBean");
		testBean.test();
		try {
			TimeUnit.SECONDS.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
