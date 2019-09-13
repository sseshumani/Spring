package com.BT.spring.springcore.constructorInj.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcore/constructorInj/ambiguity/config.xml");
		Addition add = (Addition) ctx.getBean("add");
		System.out.println(add);
	
	}

}
