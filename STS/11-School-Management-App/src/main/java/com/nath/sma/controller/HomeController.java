package com.nath.sma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String homePage(Model model) {
		return "home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/index")
    public String index(Model model){
        model.addAttribute("index", model);
        return "index";
    }
	
	@GetMapping("/media")
    public String medaiPage(Model model){
        model.addAttribute("media", model);
        return "media";
    }
	
}
