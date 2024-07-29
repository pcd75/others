package com.adi.demo.log4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String welcome() {
		
		String msg = "Start Point";
		logger.info("this is entering point " +msg);
		System.out.println("this is logging level info");
		
		String msgs = "End Point";
		logger.info("this is exit point " + msgs );

		return "Welcome to Logger demo";
	}

}
