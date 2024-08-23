package com.springcore.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.beans.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student) {
		int i =(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	@Transactional
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	
	public Student getStudent(int id) {
		Student std = hibernateTemplate.get(Student.class, id);
		return std;
	}

	public List<Student> getAllStudent() {
		List<Student> std = hibernateTemplate.loadAll(Student.class);
		return std;
	}

	public Student getStudentById(String name, int id) {
	    String hql = "from Student where stdName=:name and stdId = :id";
	    List<Student> results = (List<Student>) hibernateTemplate.findByNamedParam(hql, new String[]{"name", "id"}, new Object[]{name, id});
	    
	    if (results != null && !results.isEmpty()) {
	        return results.get(0);
	    } else {
	        return null; // or handle the case where no student is found
	    }
	}

	@Transactional
	public void deleteStudent(int id) {
		Student std = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(std);
		
	}

}
