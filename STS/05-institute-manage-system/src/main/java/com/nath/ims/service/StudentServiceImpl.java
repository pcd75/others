package com.nath.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.ims.entity.Student;
import com.nath.ims.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	
//    @Autowired
//    public void setStudentRepository(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }
//
//    @Override
//    public Iterable<Student> listAllStudents() {
//        
//
//        return studentRepository.findAll();
//    }
//
//    @Override
//    public Student saveStudent(Student student) {
//        
//
//        return studentRepository.save(student);
//        
//    }
//
//    @Override
//    public long getLastId() {
//        return studentRepository.count();
//    }
//    

}
