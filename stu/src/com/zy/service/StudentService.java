package com.zy.service;

import java.sql.SQLException;
import java.util.List;

import com.zy.domain.PageBean;
import com.zy.domain.Student;

public interface StudentService {
	
	
	List<Student> findAll() throws SQLException;
	void insert(Student student) throws SQLException;
	
	void delete(int sid) throws SQLException;
	void update(Student student) throws SQLException;
	List<Student> searchStudent(String sname, String sgender) throws SQLException;
	Student findStudentById(int sid) throws SQLException;
	PageBean findStudentByPage(int currentPage) throws SQLException;
}
