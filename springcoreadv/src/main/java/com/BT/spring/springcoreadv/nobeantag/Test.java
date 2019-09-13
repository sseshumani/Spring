package com.BT.spring.springcoreadv.nobeantag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcoreadv/nobeantag/config.xml");
		Employee1 bean1 = (Employee1) ctx.getBean("emp1");
		System.out.println(bean1);
		
		Employee1 bean2 = (Employee1) ctx.getBean("emp1");
		System.out.println(bean2);
		
		
		Books bean3=(Books) ctx.getBean("books");
		System.out.println(bean3);
	}

}
