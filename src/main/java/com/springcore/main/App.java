package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Demo;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);
    }
}
