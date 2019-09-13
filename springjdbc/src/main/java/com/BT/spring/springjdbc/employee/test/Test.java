package com.BT.spring.springjdbc.employee.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springjdbc/config.xml");
		JdbcTemplate jdbctemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql="insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql,new Integer(13),"some","name");
		System.out.println("number of rows inserted"+result);
		
		
	}

}
