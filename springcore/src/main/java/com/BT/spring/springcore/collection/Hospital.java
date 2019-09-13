package com.BT.spring.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Hospital {

	private String name;
	private List<String> departments;
	private Set<String> canteen;
	private Map<Integer,String> prices;
	
	private Properties bedcost;

	public Properties getBedcost() {
		return bedcost;
	}

	public void setBedcost(Properties bedcost) {
		this.bedcost = bedcost;
	}

	public Map<Integer, String> getPrices() {
		return prices;
	}

	public void setPrices(Map<Integer, String> prices) {
		this.prices = prices;
	}

	public Set<String> getCanteen() {
		return canteen;
	}

	public void setCanteen(Set<String> canteen) {
		this.canteen = canteen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", departments=" + departments + ", canteen=" + canteen + ", prices=" + prices
				+ ", bedcost=" + bedcost + "]";
	}

	

	
	
	

}
