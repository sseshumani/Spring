package com.BT.spring.springcoreadv.injecting.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcoreadv/injecting/interfaces/config.xml");
		DispatchTeam bean = (DispatchTeam) ctx.getBean("dispatch");
		bean.isdispatched();
	
	}

}
