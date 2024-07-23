package com.springcore.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.beans.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;

public Student getStudent(int studentId) {
	String query = "Select * from student where id =?";
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

}
