package com.BT.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcore/reftypes/refconfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		
	}

}
