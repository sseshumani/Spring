package com.seshu.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
    	Service service = ctx.getBean(Service.class);
    	service.someMethod();
    	
    }
}
