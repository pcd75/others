package com.nath.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nath.microservice.limitsservice.bean.Limits;
import com.nath.microservice.limitsservice.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
//		return new Limits(1, 1000);
		
	}

}
