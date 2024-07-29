package com.src.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Admin;
import com.src.model.Bus;
import com.src.service.AdminServiceI;

@Controller
public class AdminController {

	private static final Logger logger = Logger
			.getLogger(AdminController.class);

	public AdminController() {
		System.out.println("AdminController()");
	}

	
	@Autowired
	private AdminServiceI adminService;
	
	@RequestMapping(value = "/")
	public ModelAndView displayHome(ModelAndView model) throws IOException {
		
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/admin")
	public ModelAndView adminLogin(ModelAndView model) throws IOException {
		Admin admin=new Admin();		
		model.addObject("admin", admin);		
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView adminLogin(@ModelAttribute("admin")Admin ad,ModelAndView model) throws IOException {
		
		boolean b=adminService.validate(ad);
		Bus bus=new Bus();
		model.addObject("bus",bus);
		if(b)
		{
		model.setViewName("/bus");
		}
		else
		{
			model.setViewName("admin");
		}
		return model;
	}

	
}