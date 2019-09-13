package com.BT.spring.springcore.propertyplaceholder;

public class MyDao {
	
	public MyDao(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}

	private String dbServer;

}
