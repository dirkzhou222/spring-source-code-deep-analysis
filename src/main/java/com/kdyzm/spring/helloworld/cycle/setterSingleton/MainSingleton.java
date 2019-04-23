package com.kdyzm.spring.helloworld.cycle.setterSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSingleton {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kdyzm/spring/helloworld/cycle/setterSingleton/application.xml");
		System.out.println(context.getBean("testA"));
	}
}
