package com.nath.student_mange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nath.student_mange.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	public List<Student> findAllByOrderByLastName();
	
	@Query(value = "SELECT * FROM Student WHERE qualification = :qualification", nativeQuery = true)
	  public List<Student> filterByQualification(@Param("qualification")String Qualification);
}
