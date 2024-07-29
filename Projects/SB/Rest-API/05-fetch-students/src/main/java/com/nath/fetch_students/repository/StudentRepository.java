package com.nath.fetch_students.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nath.fetch_students.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public List<Student> findAllByOrderByIdAsc();
	
	public List<Student> findAllByOrderByFirstNameAsc();
	
	public Student findById(int id);
}
