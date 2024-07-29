package com.nath.springboot.jpa.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.springboot.jpa.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	

}
