package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String cof_path = "com/springcore/resources/collectionConfig.xml";;
    	ApplicationContext context = new ClassPathXmlApplicationContext(cof_path);
    	
    	Emp em = (Emp) context.getBean("emp1");
        System.out.println(em.getAddresses());
        System.out.println(em.getCourses());
        System.out.println(em.getPhones());
    }
}
