package com.nath.sma.service;

import java.util.List;

import com.nath.sma.entity.Fees;
import com.nath.sma.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();
	
	public Student findIdBy(long theId);
	
	public void saveStudent(Student theStudent);
	
	public void deleteById(long theId);
	
	long getLastId();
	
	Iterable<Student> getAllStudent();

    void save(Student student);

    Student findById(long id);
    
    void delete(Student student);

    Student findBySui(String string);

    long count();
	
	Iterable<Student> listAllStudents();
//
//    void saveStudent(Student student);
//
//    long getLastId();
//
//	void deleteById(int theId);



}
