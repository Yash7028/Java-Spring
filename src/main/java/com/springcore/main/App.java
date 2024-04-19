package com.springcore.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Pepsi;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Pepsi pep = (Pepsi) context.getBean("pep");
		System.out.println(pep);
		context.registerShutdownHook();
	}
}
