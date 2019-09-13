package com.BT.spring.springcore.reftypes;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	private Scores scores;

	@Override
	public String toString() {
		return "Student [name=" + name + ", scores=" + scores + "]";
	}

	
}
