package com.nath.student_mange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/userLogin")
	public String userLogin() {
		return "user-login";
	}
	
//	@GetMapping("/listStu")
//	public String getAllStudents(Model model) {
//		model.addAttribute("students", studentService.getAllStudentsList());
//		return "list-students";
//	}

}