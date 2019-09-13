package com.BT.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("spring calls setter() before init()");
		this.id = id;
	}

	
	@PostConstruct
	public void hi() {
		System.out.println("this is init() too name need not be init");
	}
	
	
	@PreDestroy
	public void bye() {
		System.out.println("this is destroy() too name need not be destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
