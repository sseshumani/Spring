package com.BT.spring.springcoreadv.standalonecoll;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcoreadv/standalonecoll/config.xml");
		Products bean = (Products) ctx.getBean("products");
		System.out.println(bean);
	
	}

}
