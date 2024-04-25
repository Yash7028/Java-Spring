package com.springcore.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springcore.beans.Student;

@Configuration
//@ComponentScan(basePackages = "com.springcore.beans")
public class ConfigFile {

	@Bean
	public Student createObj() {
		Student std = new Student();
		std.setName("yash");
		std.setRollno(10);
		return std;
	}
	
}
