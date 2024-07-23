package com.springcore.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;
import com.springcore.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.springcore.dao"})
public class JdbcConfig {

//	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}
	
@Bean("template")
	public JdbcTemplate getTemplate() {
	 JdbcTemplate jdbcTemplate = new JdbcTemplate();
	 jdbcTemplate.setDataSource(getDataSource());
	 return jdbcTemplate;
	}
	
}
