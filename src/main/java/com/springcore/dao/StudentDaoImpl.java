package com.springcore.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.beans.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;

public int update(Student student) {
	String query = "update student set name =? , city=? where id=?";
	int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	return r ;
}

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

}
