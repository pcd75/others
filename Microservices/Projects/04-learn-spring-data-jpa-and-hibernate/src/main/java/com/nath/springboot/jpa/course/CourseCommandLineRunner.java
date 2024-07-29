package com.nath.springboot.jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nath.springboot.jpa.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Micro-service","in28"));
		repository.save(new Course(2,"Azure","in28"));
		repository.save(new Course(3,"AWS","in28"));
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));

		
	}

}
