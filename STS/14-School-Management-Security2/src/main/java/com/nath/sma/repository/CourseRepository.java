package com.nath.sma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findById(long id);
}