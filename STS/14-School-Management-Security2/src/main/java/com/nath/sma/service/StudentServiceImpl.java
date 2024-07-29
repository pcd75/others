package com.nath.sma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.sma.entity.Fees;
import com.nath.sma.entity.Student;
import com.nath.sma.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	 @Autowired
	    private StudentRepository studentRepository;

	    @Autowired
	    public void setStudentRepository(StudentRepository studentRepository){
	        this.studentRepository = studentRepository;
	    }
	    
	    
	    public List<Student> findAll() {
			return studentRepository.findAll();
		}

//		@Override
//		public Student findIdBy(long theId) {
//			Optional<Student> result = studentRepository.findById(theId);
//			Student theStudent = null;
//			
//			if(result.isPresent()) {
//				theStudent = result.get();
//			}else {
//				throw new RuntimeException("Did Not find employee id - " + theId);
//			}
//			return theStudent;
//		}

		@Override
		public void saveStudent(Student theStudent) {
			studentRepository.save(theStudent);

		}

		@Override
		public void deleteById(long theId) {
			studentRepository.deleteById(theId);

		}

	    @Override
	    public Iterable<Student> listAllStudents() {
	        return studentRepository.findAll();
	    }

//	    @Override
//	    public void saveStudent(Student student) {
//	       studentRepository.save(student);
//	        
//	    }
//
	    @Override
	    public long getLastId() {
	        return studentRepository.count();
	    }
//
//		@Override
//		public void deleteById(int theId) {
//			studentRepository.deleteById(theId);
//		}
//	
	    
	    @Override
	    public Iterable<Student> getAllStudent() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public void save(Student fees) {
	        
	    	studentRepository.save(fees);
	        
	    }

	    @Override
	    public Student findById(long id) {

	        return studentRepository.findById(id);
	    }

	    @Override
	    public void delete(Student student) {
	    	studentRepository.delete(student);
	        
	    }

	    @Override
	    public Student findBySui(String sui) {
	        return null;
	    }

	    @Override
	    public long count() {
	        return studentRepository.count();
	    }


		@Override
		public Student findIdBy(long theId) {
			return null;
		}

}

