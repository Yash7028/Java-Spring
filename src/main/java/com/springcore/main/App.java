package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Emp;
import com.springcore.beans.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Student std = context.getBean("obj", Student.class);
		System.out.println(std);
		System.out.println(std.getAddress().getClass().getName());
		Student std2 = context.getBean("obj", Student.class);
		System.out.println("Singleton example same hashcode");
		System.out.println(std.hashCode());
		System.out.println(std2.hashCode());

		Emp em = context.getBean("emp", Emp.class);
		Emp em2 = context.getBean("emp", Emp.class);
		System.out.println(em);
		System.out.println("Prototypw example different hashcode");
		System.out.println(em.hashCode());
		System.out.println(em2.hashCode());

	}
}
