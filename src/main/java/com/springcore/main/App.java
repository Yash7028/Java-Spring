package com.springcore.main;

import java.util.List;

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
  
  List<Student> students = studentDao.getAllStudent();
	for(Student s:students) {
		System.out.println(s);
	}
  
    }
}
