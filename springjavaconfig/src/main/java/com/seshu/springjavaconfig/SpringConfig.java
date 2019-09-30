package com.seshu.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Daoconfig.class)
public class SpringConfig {
	
	
	
	@Bean
	public Service service() {
		return new Service();
	}

}
