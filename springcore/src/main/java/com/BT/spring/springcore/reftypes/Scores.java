package com.BT.spring.springcore.reftypes;

public class Scores {

	private double maths;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
	}

	private double science;

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", science=" + science + "]";
	}
	
	

}
