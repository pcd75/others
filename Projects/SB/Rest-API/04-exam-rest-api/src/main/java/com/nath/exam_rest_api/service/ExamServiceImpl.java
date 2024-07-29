package com.nath.exam_rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nath.exam_rest_api.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService{
	
	@Autowired
	private ExamRepository examRepo;

	private final RestTemplate restTemplate;

    public ExamServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataFromApi() {
        String apiUrl = "http://localhost:8080/list";  // Replace with your API URL
        return restTemplate.getForObject(apiUrl, String.class);
    }
    
    
//	@Override
//	public Exam getAllStudents(Exam student) {
//		examRepo.save(student);
//
//		String url = "http://localhost:8080/list";
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Exam> postForEntity = rt.postForEntity(url, student, Exam.class);
//		Exam exam = postForEntity.getBody();
//
//		return exam;
//	}

}
