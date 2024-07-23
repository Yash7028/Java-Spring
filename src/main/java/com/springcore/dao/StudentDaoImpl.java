package com.springcore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.beans.Student;

@Component("studentDaoImpl") // this name declare in app.java ("studentDaoImpl", StudentDao.class);
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
private JdbcTemplate jdbcTemplate;

public List<Student> getAllStudent(){
	String query = "Select *  from student ";
	List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
	return students;
}
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

}
