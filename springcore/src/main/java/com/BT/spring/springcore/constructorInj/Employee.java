package com.BT.spring.springcore.constructorInj;

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
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cadre getCadre() {
		return cadre;
	}

	public void setCadre(Cadre cadre) {
		this.cadre = cadre;
	}

	private String name;
	
	private Cadre cadre;
	
	

}
