package com.nath.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to Spring security Bank of spring";
	}
	
	@GetMapping("/balance")
	public String getBalance(){
		
		return "your balacne is: 1234.56 INR";
	}
	
	@GetMapping("/statement")
	public String getStatement() {
		return "Statement is generated and sent to your email id";
	}
	
	@GetMapping("myLoan")
	public String getMyLoan() {
		return "Your loan amount due: 9876543.34 INR";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Thank you for contacting, we will get back to you soon";
	}

}
