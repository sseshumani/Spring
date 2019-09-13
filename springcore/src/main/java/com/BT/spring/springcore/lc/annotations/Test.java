package com.BT.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcore/lc/annotations/config.xml");
		Patient p = (Patient) ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
	}
}
