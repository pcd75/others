package com.nath.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.cms.entity.Student;
import com.nath.cms.repository.StudentRepository;


public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public void saveStudent(Student theStudent) {
		this.studentRepo.save(theStudent);
	}

	@Override
	public Student getStudentById(long theId) {
		Optional<Student> optional = studentRepo.findById(theId);
		Student theStudent = null;
		if(optional.isPresent()) {
			theStudent = optional.get();
		}else {
			throw new RuntimeException("Student not found for id : " + theId);
		}
		return theStudent;
	}

	@Override
	public void deleteStudnetById(long theId) {
		this.studentRepo.deleteById(theId);
	}
}
