package com.BT.spring.springcore.constructorInj;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cadre=" + cadre + "]";
	}

	
	public Employee(int id, String name, Cadre cadre) {
		super();
		this.id = id;
		this.name = name;
		this.cadre = cadre;
	}

	private int id;
	

	private String name;
	
	private Cadre cadre;
	
	

}
