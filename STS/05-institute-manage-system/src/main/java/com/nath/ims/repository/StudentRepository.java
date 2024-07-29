package com.nath.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nath.ims.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findById(long id);

}
