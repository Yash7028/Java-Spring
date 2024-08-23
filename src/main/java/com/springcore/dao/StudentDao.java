package com.springcore.dao;

import java.util.List;

import com.springcore.beans.Student;

public interface StudentDao {
public int insert(Student student);
public void update(Student student);
public Student getStudent(int id);
public List<Student> getAllStudent();
public Student getStudentById(String name, int id);
public void deleteStudent(int id);
}
