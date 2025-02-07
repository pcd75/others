package com.nath.my_office_page.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    
    @GetMapping("/home")
	public String homePage() {
		return "home";
	}
    
    @GetMapping("/admin")
    public String forAdmin() {
    	return "admin";
    }
    
    @GetMapping("/manager")
    public String forManager() {
    	return "manager";
    }
    
    @GetMapping("/employee")
    public String forEmployees() {
    	return "employee";
    }
    
}