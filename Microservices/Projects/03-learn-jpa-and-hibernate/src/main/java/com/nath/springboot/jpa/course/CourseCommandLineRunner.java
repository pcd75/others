package com.nath.springboot.jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nath.springboot.jpa.course.jdbc.CourseJdbcRepository;
import com.nath.springboot.jpa.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Micro-service","in28"));
		repository.insert(new Course(2,"Azure","in28"));
		repository.insert(new Course(3,"AWS","in28"));
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));

		
	}

}
