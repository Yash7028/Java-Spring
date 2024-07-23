package com.springcore.dao;

import java.util.List;

import com.springcore.beans.Student;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(Student student);
public Student getStudent(int studentId);
public List<Student> getAllStudent();

}
