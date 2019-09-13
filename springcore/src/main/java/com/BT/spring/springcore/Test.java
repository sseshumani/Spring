package com.BT.spring.springcore;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springcore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);
		System.out.println(emp.hashCode());
		
		Employee emp1 = (Employee) ctx.getBean("emp");
		System.out.println(emp1.hashCode());
		
		//RequiredAnnotationBeanPostProcessor 
	}

}
