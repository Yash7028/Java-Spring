package com.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*Note :  extra dependencies for this feature */
public class Employee {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [name=" + name + "]";
}
@PostConstruct
public void start() {
	System.out.println("Init method");
}

@PreDestroy
public void end() {
	System.out.println("destroy method");
}

}
