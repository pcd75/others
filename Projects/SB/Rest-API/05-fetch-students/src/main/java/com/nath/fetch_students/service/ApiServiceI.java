package com.nath.fetch_students.service;

import java.util.List;

import com.nath.fetch_students.model.Student;

public interface ApiServiceI {
	
	 public List<Student> getAllData();
	 	 
	 public String fetchDataFromApi();
	 
	 public void fetchAndSaveData();

}
