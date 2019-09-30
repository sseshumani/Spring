package com.seshu.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Daoconfig {
	
	@Bean
	public Dao dao(){
	return new Dao();	
	}

}
