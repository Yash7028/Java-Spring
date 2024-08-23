package com.springcore.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

		Student std = new Student(104, "rahul", "mumbai");

//	 insertaion operation
//   int result = studentDao.insert(std);
//   System.out.println(result);

//   update Opeartion 
//   studentDao.update(std);
//   System.out.println("successed");
		
//	Retrieve opration
//	Student result = studentDao.getStudent(104);
//    System.out.println(result);
		
//	Retrieve all student
//	List<Student> result = studentDao.getAllStudent();
//	for(Student all :result){
//		System.out.println(all);
//	}
	
//		Retrieve by id and name
//		Student result =  studentDao.getStudentById("rahul", 104);
//		System.out.println(result);
		
//		Delete and check
//		studentDao.deleteStudent(104);
//		List<Student> result = studentDao.getAllStudent();
//		for(Student all :result){
//			System.out.println(all);
//		}
	
	}
}
