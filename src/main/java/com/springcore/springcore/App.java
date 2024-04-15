package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String config_loc = "/com/springcore/springcore/config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        Student std = (Student) context.getBean("std1");
        System.out.println(std);
        
        Student std2 = (Student) context.getBean("std2");
        System.out.println(std2);
    }
}
