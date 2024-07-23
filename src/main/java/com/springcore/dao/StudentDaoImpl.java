package com.springcore.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.beans.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;

public int insert(Student student) {
	String query = "INSERt INTO student(id, name, city) VALUES(?,?,?)";
	int r =  this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	return r;
}

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

}
