package com.seshu.spring.componentandautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/seshu/spring/componentandautowiring/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
