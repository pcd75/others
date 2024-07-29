package com.nath.student_mange.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nath.student_mange.entity.Student;
import com.nath.student_mange.service.StudentService;

@RestController
class StudentRestController{
	
	private StudentService studentService;

	public StudentRestController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/list")
	public List<Student> listStudents(Model theModel) {
		List<Student> theStudents  = studentService.getAllStudents();
		theModel.addAttribute("students", theStudents);
		return theStudents;
	}
	
	@GetMapping("/filterByQual/{qual}")
	public List<Student> filterByQualification(@PathVariable(value = "qual")String qual){
		List<Student> theStudents = studentService.filterByQualification(qual);
		return theStudents;
	}
}