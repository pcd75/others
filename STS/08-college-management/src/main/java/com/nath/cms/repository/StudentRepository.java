package com.nath.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.cms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
