package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;
import com.springcore.resources.JdbcConfig;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
  StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
  

	Student student = new Student();
	student.setId(1);
	student.setName("dinakar");
	student.setCity("Malad");
  
	
	int result = studentDao.update(student);
	System.out.println(result);
  
    }
}
