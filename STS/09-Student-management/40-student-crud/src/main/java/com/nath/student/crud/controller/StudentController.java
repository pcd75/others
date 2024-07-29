package com.nath.student.crud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nath.student.crud.entity.Student;
import com.nath.student.crud.service.StudentService;

@Controller
public class StudentController {

	@Autowired(required = false)
    private StudentService studentService;

	@GetMapping("/welcome")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/list")
	public String viewStudentList(Model theModel) {
		theModel.addAttribute("listStudents",studentService.getAllStudents());
		return "list";
	}
	
	@GetMapping("/register")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		
		theModel.addAttribute("student", theStudent);
		
		return "register-form";
	}
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("student") Student theStudent,
			BindingResult bindingResult, Model model) {
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
	
}
    
