package com.nath.student.crud.service;

import java.util.List;

import com.nath.student.crud.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	void saveStudent(Student theStudent);
	Student getStudentById(long theId);
	void deleteStudnetById(long theId);

}
