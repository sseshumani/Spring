package com.BT.spring.springcore.constructorInj.ambiguity;

public class Addition {
	
	private int a;

	public Addition(int a, double b) {
		
		  this.a=a; this.b=b;
		 
		System.out.println("inside int,double constr");
	}

	public Addition(double a, int b) {
		
		System.out.println("inside double,int constr");
		System.out.println(a);
		System.out.println(b);
	}

    public Addition(String a, String b) {
		
		System.out.println("inside string constr");
	}

   public Addition(double a, double b) {
		
		System.out.println("inside double constr");
	}

    
	@Override
    public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}


	private double b;
	
	
	


}
