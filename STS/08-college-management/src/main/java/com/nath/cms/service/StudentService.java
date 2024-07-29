package com.nath.cms.service;

import java.util.List;

import com.nath.cms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	void saveStudent(Student theStudent);
	
	Student getStudentById(long theId);
	
	void deleteStudnetById(long theId);

}
