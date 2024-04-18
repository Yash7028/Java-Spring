package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Samosa;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Samosa smo = (Samosa) context.getBean("smo");
		System.out.println(smo);

		// call destroy method
		context.registerShutdownHook();
	}
}
