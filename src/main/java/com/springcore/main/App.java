package com.springcore.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Employee;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.registerShutdownHook();
	}
}
