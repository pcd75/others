package com.nath.student_mange.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nath.student_mange.entity.Student;
import com.nath.student_mange.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/register")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);

		theModel.addAttribute("student", theStudent);

		return "register-form";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult,
			Model model) {
		System.out.println(theStudent);

		if (bindingResult.hasErrors()) {

			return "register-form";
		} else {
			studentService.saveStudent(theStudent);
			return "register-success";
		}
	}

	@GetMapping("/registration")
	public String registerNew(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "new-student";
	}

	@PostMapping("/saveStudent")
	public String sveStudent(@ModelAttribute("student") Student theStudent) {
		studentService.saveStudent(theStudent);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get employee from the service
		Student theStudent = studentService.getStudentById(id);

		// set employee as a model attribute to pre-populate the form
		model.addAttribute("student", theStudent);
		return "update_student";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") long id) {
		// call delete employee method
		this.studentService.deleteStudnetById(id);
		return "redirect:/";
	}
	
	@GetMapping("/filter")
    public String search(@RequestParam("qualification") String qaulification, Model model) {
        List<Student> students = studentService.filterByQualification(qaulification);
        model.addAttribute("students", students);
        return "list-students";
    }

}
