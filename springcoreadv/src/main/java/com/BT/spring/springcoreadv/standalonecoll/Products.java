package com.BT.spring.springcoreadv.standalonecoll;

import java.util.List;

public class Products {
	
	List<String> productnames;

	public List<String> getProductnames() {
		return productnames;
	}

	public void setProductnames(List<String> productnames) {
		this.productnames = productnames;
	}

	@Override
	public String toString() {
		return "Products [productnames=" + productnames + "]";
	}

	
	
}
