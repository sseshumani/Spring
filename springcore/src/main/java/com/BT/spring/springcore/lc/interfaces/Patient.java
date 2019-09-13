package com.BT.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("spring calls setter() before init()");
		this.id = id;
	}

	public void init() {
		System.out.println("inside init()");
	}
	
	public void hi() {
		System.out.println("this is init() too name need not be init");
	}
	
	/*
	 * public void destroy() { System.out.println("inside destroy() of interfaces");
	 * }
	 */
	
	public void bye() {
		System.out.println("this is destroy() too name need not be destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
     System.out.println("this is init() from implementing the interfaces");		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy() of interfaces");		
	}
	
	
}
