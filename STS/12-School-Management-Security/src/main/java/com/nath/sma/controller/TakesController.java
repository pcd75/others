package com.nath.sma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.sma.entity.Classe;
import com.nath.sma.entity.Course;
import com.nath.sma.entity.Takes;
import com.nath.sma.entity.Teachers;
import com.nath.sma.service.ClasseService;
import com.nath.sma.service.CourseService;
import com.nath.sma.service.TakesService;
import com.nath.sma.service.TeacherService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/takes/")
public class TakesController {
    private final TakesService takesService;

	private ClasseService classeService;
	//private TeacherService teacherService;
	private CourseService courseService;


	@Autowired
	public TakesController(ClasseService classeService, TakesService takesService, TeacherService teacherService, CourseService courseService){
		this.classeService = classeService;
		this.courseService = courseService;
		this.takesService = takesService;
		//this.teacherService = teacherService;
	}

	@GetMapping("teachers/course")
	public String getTakesCourse(Takes take, Model model, Course course, Classe classe, Teachers
	 teacher){
		model.addAttribute("takes", new Takes());
			model.addAttribute("course", courseService.listAllCourses());
			model.addAttribute("classe", classeService.getAllClasse());
			//model.addAttribute("teacher", teacherService.listAllTeachers());
		return "add-takes";
	}

	@GetMapping("teachers/course/list")
	public String showTakesCourse(Model model){
		model.addAttribute("takess", takesService.listAllTakes());
		return "take";
	}

	@PostMapping("teachers/course/add")
	public String addTeaCou(@Valid Takes takes, BindingResult result, Model model){
		if(result.hasErrors()){
			return "add-takes";
		}
		takesService.saveTakes(takes);
		model.addAttribute("takess", takesService.listAllTakes());
		model.addAttribute("classes", classeService.getAllClasse());
		//model.addAttribute("teachers", teacherService.listAllTeachers());
		model.addAttribute("courses", courseService.listAllCourses());
		
		return "take";
	}

	@GetMapping("teacher/course/edit/{id}")
	public String ShowUpdateForm(@PathVariable("id") long id, Model model){
		Takes takes = (takesService.findById(id));
		//.orElseThrow(()-> new IllegalArgumentException("Invalid takes id:" + id));

		model.addAttribute("takes", takes);
		model.addAttribute("classes", classeService.getAllClasse());
		//model.addAttribute("teachers", teacherService.listAllTeachers());
		model.addAttribute("courses", courseService.listAllCourses());
		return "update-takes";
	}

	@PostMapping("teacher/course/update/{id}")
	public String updateTakes(@PathVariable("id") long id, @Valid Takes takes, BindingResult result, Model model){
		if(result.hasErrors()){
			takes.setId(id);
			return "update-takes";
		}
		takesService.saveTakes(takes);
		model.addAttribute("classes", classeService.getAllClasse());
		//model.addAttribute("teachers", teacherService.listAllTeachers());
		model.addAttribute("courses", courseService.listAllCourses());
		return "take";

	}

	@GetMapping("teacher/course/delete/{id}")
	public String deteletTakes(@PathVariable("id") long id, Model model){
		Takes takes= (takesService.findById(id));
		//.orElseThrow(() -> new IllegalArgumentException("Invalide takes id:" + id));
		
		takesService.deleteTakes(takes);
		model.addAttribute("takes", takesService.listAllTakes());
		model.addAttribute("classes", classeService.getAllClasse());
		//model.addAttribute("teachers", teacherService.listAllTeachers());
		model.addAttribute("courses", courseService.listAllCourses());
		return "take";
	}

}
