package com.springcore.beans;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println("setting property.");
		return "Samosa [price=" + price + "]";
	}

//you can change method 
	public void init() {
		System.out.println("init method");
	}

	public void destroy() {
		System.out.println("destroy method");
	}
}
