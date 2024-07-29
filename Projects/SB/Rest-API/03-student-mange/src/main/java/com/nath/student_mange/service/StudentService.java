package com.nath.student_mange.service;

import java.util.List;

import com.nath.student_mange.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	void saveStudent(Student theStudent);
	
	Student getStudentById(long theId);
	
	void deleteStudnetById(long theId);
	
	Iterable<Student> getAllStudentsList();
	
	public List<Student> filterByQualification(String qual);


}
