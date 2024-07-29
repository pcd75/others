package com.nath.exam_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nath.exam_rest_api.service.ExamService;

@RestController
public class ExamController {

	private ExamService examService;

	public ExamController(ExamService examService) {
		this.examService = examService;
	}

	@GetMapping("/fetch-data")
	public String fetchData() {
		return examService.fetchDataFromApi();
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to Exam Page";
	}

}
