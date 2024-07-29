package com.nath.sma.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nath.sma.entity.Fees;
import com.nath.sma.entity.Student;
import com.nath.sma.repository.ClasseRepository;
import com.nath.sma.repository.StudentRepository;
import com.nath.sma.service.ClasseService;
import com.nath.sma.service.StudentService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private final StudentService studentService;

	@Autowired
	private final StudentRepository studentRepository;

	@Autowired
	private ClasseService classeService;

	@Autowired
	public StudentController(StudentService studentService, StudentRepository studentRepository,
			ClasseService classeService) {
		this.studentService = studentService;
		this.studentRepository = studentRepository;
		this.classeService = classeService;
	}

//	@Autowired(required = false)
//    private StudentService studentService;

	@GetMapping("/welcome")
	public String home() {
		return "welcome";
	}

	@GetMapping("/list")
	public String viewStudentList(Model theModel) {
		theModel.addAttribute("students", studentService.findAll());
		return "student";
	}

	@GetMapping("/signup")
	public String showSignUpForm(Student student, Model model) {
		model.addAttribute("classes", classeService.getAllClasse());
		return "add-student";
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

	@PostMapping("add")
	public String addStudent(@Valid Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-student";
		}

		Student u = studentRepository.save(student);
		long b = u.getId();
		String a = "SMS2E00" + b;
		if (a != student.getSui()) {
			String E = new String();
			student.setSui(a + E);
		}
		student.setSui(a);
		studentService.saveStudent(student);
		model.addAttribute("classes", classeService.getAllClasse());
		return "redirect:list";
	}

	@GetMapping("view/{id}")
	public String viewStudent(@PathVariable("id") long id, Model model){
		model.addAttribute("students", studentRepository.findById(id));
		return "view-student";
	}
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		Student student = (studentRepository.findById(id));
				//.orElseThrow(() -> new IllegalArgumentException("Invalid student id:" + id));
		model.addAttribute("student", student);
		model.addAttribute("classes", classeService.getAllClasse());
		return "update-student";
	}

	@PostMapping("update/{id}")
	public String updateStudent(@PathVariable("id") long id, @Valid Student student, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			student.setId(id);
			return "update-student";
		}

		studentRepository.save(student);
		model.addAttribute("students", studentRepository.findAll());
		//model.addAttribute("sections", sectionService.listAllSections());
		model.addAttribute("classes", classeService.getAllClasse());
		return "student";
	}
	
//	@GetMapping("/edit/{id}")
//	public String showFormForUpdate(@RequestParam("studentId") int theId, Model model) {
//		
//		// get the employee from the service
//		Student theStudent = studentService.findIdBy(theId);
//		
//		// set employee as a model attribute to pre-populate the form
//		model.addAttribute("student", theStudent);
//		model.addAttribute("classes", classeService.getAllClasse());
//		
//		// send over to our form
//		return "update-student";
//	}

//	@GetMapping("edit/{id}")
//	public String showUpdateForm(@PathVariable("id") long id, Model model,Student student, BindingResult result ) {
//		 student = (studentRepository.findById(id));
//				//.orElseThrow(() -> new IllegalArgumentException("Invalid student id:" + id));
//		model.addAttribute("student", student);
//		model.addAttribute("classe", classeService.getAllClasse());
//		return "update-student";
//	}
	
//	 @GetMapping("edit/student/{id}")
//	    public String editStudent(@PathVariable("id") long id, Model model, BindingResult result, Student student){
//		 
//		 student = studentService.findById(id);
//	        
//	        model.addAttribute("student", student);
//	        model.addAttribute("classe", classeService.getAllClasse());
//	        model.addAttribute("student", student);
//	        return "update-student";
//	    }

//	@PostMapping("update/{id}")
//	public String updateStudent(@PathVariable("id") long id, @Valid Student student, BindingResult result,
//			Model model) {
//		if (result.hasErrors()) {
//			student.setId(id);
//			return "update-student";
//		}
//
//		studentRepository.save(student);
//		model.addAttribute("students", studentRepository.findAll());
//		//model.addAttribute("sections", sectionService.listAllSections());
//		model.addAttribute("classe", classeService.getAllClasse());
//		return "student";
//	}
	
	
	
//	@GetMapping("/delete/{id}")
//	public String delete(@RequestParam("studentId") int theId, Model model) {
//		
//		// delete the employee
//		studentService.deleteById(theId);
//		model.addAttribute("students", studentService.findAll());
//		
//		// redirect to /employees/list
//		return "list";
//	
	
	@GetMapping("delete/{id}")
    public String deleteFees(@PathVariable("id") long id, Model model){
        Student student = studentService.findById(id);
        studentService.delete(student);
        model.addAttribute("students", studentService.getAllStudent());
        return "student";
    }
	

//	@GetMapping("delete/{id}")
//	public String deleteStudent(@PathVariable("id") long id, Model model) {
//		Optional<Student> student = (studentRepository.findById(id));
//				//.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
//		studentRepository.deleteById(student);
//		model.addAttribute("students", studentRepository.findAll());
//		return "student";
//	}
		
}
