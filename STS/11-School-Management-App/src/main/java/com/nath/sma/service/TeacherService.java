package com.nath.sma.service;


import com.nath.sma.entity.Teachers;

public interface TeacherService {

Iterable<Teachers> getAllTeachers();

void saveTeacher(Teachers teacher);

Teachers findById(long id);

void deleteTeacher(Teachers teachers);
    
}
