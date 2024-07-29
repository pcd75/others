package com.nath.sma.service;

import com.nath.sma.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);
    void deleteCourse(Course course);
    Course findById(long id);

    Iterable<Course> listAllCourses();
    
}
