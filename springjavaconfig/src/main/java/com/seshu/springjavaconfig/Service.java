package com.seshu.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Service {
	
	@Autowired
	Dao dao;
	
	void someMethod() {
		dao.create();
		System.out.println("some mthd");
	}

}
