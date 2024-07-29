package com.nath.sma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Classe;
import com.nath.sma.entity.Fees;
import com.nath.sma.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	void deleteById(int theId);
	
	Student findById(long id);

//	@Query(value = "SELECT s FROM Student s WHERE Student.sui LIKE : classe ")
	List<Student> findBySui(@Param("classe") Class<? extends Classe> s);
}
