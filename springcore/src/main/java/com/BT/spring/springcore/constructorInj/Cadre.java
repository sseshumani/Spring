package com.BT.spring.springcore.constructorInj;

public class Cadre {
	
	@Override
	public String toString() {
		return "Cadre [cadre=" + cadre + "]";
	}

	public Cadre(String cadre) {
		super();
		this.cadre = cadre;
	}

	private String cadre;

	public String getCadre() {
		return cadre;
	}

	public void setCadre(String cadre) {
		this.cadre = cadre;
	}

}
