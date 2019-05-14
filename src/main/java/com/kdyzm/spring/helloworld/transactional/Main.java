package com.kdyzm.spring.helloworld.transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 * 
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		IUserService userService = (IUserService) context.getBean("userService");
		userService.insertOrderLine(new OrderLine(30L,30,new BigDecimal(30)));
		try {
			TimeUnit.SECONDS.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
