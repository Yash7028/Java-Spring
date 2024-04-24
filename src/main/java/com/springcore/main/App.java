package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Person;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
  Person ps = (Person) context.getBean("person1");
  System.out.println(ps);
    }
}
