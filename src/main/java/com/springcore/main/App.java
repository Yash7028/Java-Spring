package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.springcore.beans.Student;
import com.springcore.resources.ConfigFile;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Student std = context.getBean("createObj",Student.class);
		System.out.println(std);
    }
}
