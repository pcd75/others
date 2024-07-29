package com.nath.exam_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.exam_rest_api.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {
	
	

}
