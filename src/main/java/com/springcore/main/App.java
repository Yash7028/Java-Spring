package com.springcore.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;
import com.springcore.resources.JdbcConfig;

public class App 
{
    public static void main( String[] args )
    {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		//===insert data into database
//		Student student = new Student();
//		student.setId(4);
//		student.setName("yashgau");
//		student.setCity("mahadmaha");
//		int result = studentDao.insert(student);
//		System.out.println(result);
		
//		Student student1 = new Student();
//		student1.setId(3);
//		student1.setName("yashbata");
//		student1.setCity("mahadcity");
//		int result1 = studentDao.insert(student1);
//		System.out.println(result1);
		
//		===update data
//		Student student = new Student();
//		student.setId(1);
//		student.setName("Yash");
//		student.setCity("Mahad");
//		
//		=== Delete data
//		Student student = new Student();
//		student.setId(3);
//		int result = studentDao.delete(student);
//		System.out.println(result);

		
//	Student student = studentDao.getStudent(1);
//	System.out.println(student );
	
	List<Student> students = studentDao.getAllStudent();
	for(Student s:students) {
		System.out.println(s);
	}
    }
}

//JdbcTemplate template =  context.getBean("jdbcTemplate", JdbcTemplate.class);
//String query="insert into student(id,name,city) Values(?,?,?)";
//int result = template.update(query,8,"gaurav","mahad");
//System.out.println(result);
