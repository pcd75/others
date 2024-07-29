package com.nath.student_mange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.student_mange.entity.Student;
import com.nath.student_mange.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAllByOrderByLastName();
	}

	@Override
	public void saveStudent(Student theStudent) {
		this.studentRepo.save(theStudent);
	}

	@Override
	public Student getStudentById(long theId) {
		Optional<Student> optional = studentRepo.findById(theId);
		Student theStudent = null;
		if (optional.isPresent()) {
			theStudent = optional.get();
		} else {
			throw new RuntimeException("Student not found for id : " + theId);
		}
		return theStudent;
	}

	@Override
	public void deleteStudnetById(long theId) {
		this.studentRepo.deleteById(theId);
	}

	@Override
	public Iterable<Student> getAllStudentsList() {
		return studentRepo.findAll();
	}

	@Override
	public List<Student> filterByQualification(String qual) {
		return studentRepo.filterByQualification(qual);
	}

}
