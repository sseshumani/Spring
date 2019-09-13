package com.BT.spring.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcore/collection/listconfig.xml");
		Hospital hosp = (Hospital) ctx.getBean("hosp");
		System.out.println(hosp);
		System.out.println(hosp.getDepartments().getClass().getName());
		System.out.println(hosp.getCanteen().getClass().getName());
		System.out.println(hosp.getPrices().getClass().getName());
		System.out.println(hosp.getBedcost().getClass().getName());
	}

}
