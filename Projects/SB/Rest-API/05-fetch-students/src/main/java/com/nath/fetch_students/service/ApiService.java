package com.nath.fetch_students.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nath.fetch_students.model.Student;
import com.nath.fetch_students.repository.StudentRepository;

@Service
public class ApiService implements ApiServiceI {

	private final RestTemplate restTemplate;
	private StudentRepository studentRepository;

	public ApiService(RestTemplate restTemplate, StudentRepository studentRepository) {
		this.restTemplate = restTemplate;
		this.studentRepository = studentRepository;
	}

	@Override
	public String fetchDataFromApi() {
		String apiUrl = "http://localhost:8080/list"; // Replace with your API URL
		return restTemplate.getForObject(apiUrl, String.class);
	}
	
	public List<String> getData() {
		String apiUrl = "http://localhost:8080/list";
//		ResponseEntity<Student[]> list = restTemplate.getForEntity(apiUrl, Student[].class);
		ResponseEntity<Student[]> responseEntity = 
			    restTemplate.getForEntity(apiUrl, Student[].class); 
		Student[] userArray = responseEntity.getBody();
			  return Arrays.stream(userArray) 
			    .map(Student::getFirstName) 
			    .collect(Collectors.toList());
	}
	
	public Student[] byWebClient(Student stu){
		String url = "http://localhost:8080/list";
		WebClient webClient = WebClient.create();
		Student[] list = webClient.get()
					.uri(url)
					.accept(MediaType.APPLICATION_JSON)
					.retrieve()
				.bodyToMono(Student[].class)
				.block();
		return list;
	}
	

	@Override
	public void fetchAndSaveData() {
		String apiUrl = "http://localhost:8080/list"; // Replace with your API URL
		Student[] studentDataArray = restTemplate.getForObject(apiUrl, Student[].class);
		if (studentDataArray != null) {
			for (Student studentData : studentDataArray) {
				studentRepository.save(studentData);
			}
		}
	}

	@Override
	public List<Student> getAllData() {
		return studentRepository.findAllByOrderByFirstNameAsc();
	}
	
	public Student getById(int id) {
		 return studentRepository.findById(id);
	}
	
	public List<Student> sortById(){
		return studentRepository.findAllByOrderByIdAsc();
	}

	
}
