package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
        StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student(324,"yash","mumbai");
        int result = studentDao.insert(student);
        System.out.println(result);
    }
}
