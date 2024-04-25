package com.springcore.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.beans.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Student std = context.getBean("obj", Student.class);
		System.out.println(std);
		System.out.println(std.getAddress().getClass().getName());
		Student std2 = context.getBean("obj", Student.class);
		
		System.out.println("Spring Expressions");
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("22+44");
		System.out.println(expression.getValue());
	}
}
