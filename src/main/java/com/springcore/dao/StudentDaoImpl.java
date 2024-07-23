package com.springcore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.beans.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
private JdbcTemplate jdbcTemplate;
//insert data
	public int insert(Student student) {
		String query="insert into student(id,name,city) Values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
//	update data
	public int change(Student student) {
		String query = "update student set name =? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r ;
	}
//	Delete data
	public int delete(Student student) {
		String query = "Delete from student where id = ? ";
		int r  = this.jdbcTemplate.update(query,student.getId());
		return r;
	};
	
//	single row mapper
	public Student getStudent(int studentId) {
        String query= "Select * from student where id =?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Student> getAllStudent() {
		// selecting multiple student
    String query = "select *  from student";
    List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}



}
