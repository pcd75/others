package com.nath.fetch_students.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nath.fetch_students.model.Student;
import com.nath.fetch_students.service.ApiService;

@RestController
public class ApiController {
	
	private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }
    
    @GetMapping("/fetch-data")
    public String fetchData() {
        return apiService.fetchDataFromApi();
    }
    
    @GetMapping("/getOnly")
    public List<String> getLi() {
    	return apiService.getData();
    }
    
    @GetMapping("/webClient")
    public Student[] getByWebClient(Student stu) {
		return apiService.byWebClient(stu);
    	
    }
    
    @GetMapping("/fetch-and-store")
    public String fetchAndStoreData() {
        apiService.fetchAndSaveData();
        return "Data fetched and stored successfully!";
    }
    
    @GetMapping("/list")
    public List<Student> listOfAllStudents(){
    	List<Student> studentList = apiService.getAllData();
    	return studentList;
    }
    
    @GetMapping("/byId/{id}")
    public Student getById(@PathVariable int id) {
    	Student student = apiService.getById(id);
    	if(student == null) {
    		return new Student(
                    new NullPointerException("User with id " + id + " not found"),
                    HttpStatus.NOT_FOUND);
    	}
    	return student;
    }
    
    @GetMapping("/sortById")
    public List<Student> sortById(){
    	return apiService.sortById();
    }
        
}
