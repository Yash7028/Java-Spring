package com.springcore.beans;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int , int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double , double");
	}

	public Addition(String a, String b) {
		System.out.println("Constructor : String , String ");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public void doSum() {
		System.out.println("A : " + this.a + ", B : " + this.b);
		System.out.println("Sum is = " + (this.a + this.b));
	}
}
