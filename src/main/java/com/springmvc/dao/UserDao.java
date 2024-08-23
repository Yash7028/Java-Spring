package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.User;

@Repository
public class UserDao {
	@Autowired
private HibernateTemplate hibernateTemplate;

	@Transactional
public int saveUser(User user) {
	int i = (Integer)hibernateTemplate.save(user);
	return i;
}
}
