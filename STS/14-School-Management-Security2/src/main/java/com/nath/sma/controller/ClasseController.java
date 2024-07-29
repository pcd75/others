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
import com.nath.sma.entity.Teachers;
import com.nath.sma.repository.ClasseRepository;
import com.nath.sma.service.ClasseService;
import com.nath.sma.service.StudentService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/classes/")
public class ClasseController {
    private final ClasseService classeService;
    private StudentService studentService;
    
    @Autowired
    private ClasseRepository classeRepository;

    @Autowired
    public ClasseController(ClasseService classeService, StudentService studentService, ClasseRepository classeRepository){
        this.classeService = classeService;
        this.studentService = studentService;
        this.classeRepository = classeRepository;
    }

    @GetMapping("classe/add")
    public String viewPage(Model model, Classe addClasse){
        model.addAttribute("addClasse", classeService.getAllClasse());
        return "add-classe";
    }

    @GetMapping("classe/list")
    public String showClasse(@Valid Classe classe, Model model){
        model.addAttribute("classes", classeService.getAllClasse());
        return "classe";
    }

    @PostMapping("add/classe")
    public String addClasse(@Valid Classe classe, Model model, BindingResult result){
        if(result.hasErrors()){
            return "add-classe";
        }
        classeService.saveClasse(classe);
        model.addAttribute("classes", classeService.getAllClasse() );
        return "classe";
    }

//    @GetMapping("edit/classe/{id}")
//    public String editClasse(@PathVariable("id") long id, Model model,BindingResult result, Classe classe ){
//        if(result.hasErrors()){
//            classe.setId(id);
//            return "classe";
//        }
//        model.addAttribute("classe", classe);
//        return "classe";
//    }

//    @GetMapping("update/classe/{id}")
//    public String updateClasse(@PathVariable("id") long id, Model model, Classe classe, BindingResult result){
//        if(result.hasErrors()){
//            classe.setId(id);
//            return "classe";
//        }
//        classeService.saveClasse(classe);
//        model.addAttribute("classes", classeService.getAllClasse());
//        return "classe";
//    }

    @GetMapping("delete/classe/{id}")
    public String deleteClasse(@PathVariable("id") long id, Model model, Classe classe, BindingResult result){
        classe = classeService.getClasseById(id);
        if(result.hasErrors()){
            classe.setId(id);
            return "classe";
        }
        classeService.deleteClasse(classe);
        return "classe";
    }

//    @GetMapping("view/classe/{id}")
//    public String viewClasse(@PathVariable("id") long id, Model model){
//        Classe classe = classeService.getClasseById(id);
//        String classeName = classe.getClassename();
//        model.addAttribute("classes", classe);
//        System.out.println(classeName);
//        return "view-classe";
//    }
    
    @GetMapping("edit/classe/{id}")
	public String editClasse(@PathVariable("id") long id, Model model) {
		Classe classe = (classeRepository.findById(id));
				//.orElseThrow(() -> new IllegalArgumentException("Invalid student id:" + id));
		model.addAttribute("classe", classe);
		return "update-classe";
	}
    
    @PostMapping("update/classe/{id}")
	public String updateClasse(@PathVariable("id") long id, @Valid Classe classe, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			classe.setId(id);
			return "update-classe";
		}

		classeRepository.save(classe);
        model.addAttribute("classes", classeService.getAllClasse());
		//model.addAttribute("sections", sectionService.listAllSections());
		return "classe";
	}

    @GetMapping("view/subject/classe/{id}")
    public String subjectClasse(@PathVariable("id") long id, Model model){
        Classe classes = classeService.getClasseById(id);
        model.addAttribute("classes", classes);
       // Class<? extends Classe> s = c.getClass();
        model.addAttribute("students", studentService.listAllStudents());
        return "view-classe";
    }

    @PostMapping("class/list/{ciu}")
    public String classList(@PathVariable("ciu") String classe_name, Model model){
        System.out.println(classe_name);
        return null;
    }



}
