package com.adi.demo.log4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String welcome(String str) {
		
		logger.info("this is first method" + "     " +str);
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

}
