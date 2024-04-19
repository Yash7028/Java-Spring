package com.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [price= " + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}

	public void destroy() throws Exception {
		System.out.println("destroy method");
	}

}
