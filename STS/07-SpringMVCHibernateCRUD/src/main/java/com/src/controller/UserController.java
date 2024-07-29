package com.src.controller;

import java.io.IOException;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Bus;
import com.src.model.User;
import com.src.service.UserService;
@Controller
public class UserController {

	private static final Logger logger = Logger
			.getLogger(UserController.class);

	public UserController() {
		System.out.println("UserController()");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login1(){
		
		return "index";
	}
	
	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public String nextpage(@RequestParam("email") String email,@RequestParam("password") String password){
		
		
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(){
		
		return "home";
	}
	@RequestMapping(value = "/buslist", method = RequestMethod.GET)
	public ModelAndView trainlist(ModelAndView model) {
		Bus b = new Bus();
		model.addObject("buslist", b);
		model.setViewName("buslist");
		return model;
	}
	
	@RequestMapping(value = "/Signup", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Bus b = new Bus();
		model.addObject("Signup", b);
		model.setViewName("Signup");
		return model;
	}
	@RequestMapping(value = "/BookTickets", method = RequestMethod.GET)
	public String BookTickets(){
		
		return "BookTickets";
	}
	@RequestMapping(value = "/Contact", method = RequestMethod.GET)
	public String Contact(){
		
		return "Contact";
	}
	

	
	@Autowired
	private UserService userService;
	
	//@RequestMapping(value = "/")
	public ModelAndView displayHome(ModelAndView model) throws IOException {
		
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/user")
	public ModelAndView userLogin(ModelAndView model) throws IOException {
		User user=new User();		
		model.addObject("user", user);		
		model.setViewName("user");
		return model;
	}
	
	@RequestMapping(value = "/login1")
	public ModelAndView userLogin(@ModelAttribute("userlogin")User ad,ModelAndView model) throws IOException {
		
		boolean b=userService.validate1(ad);
		
		if(b)
		{
		model.setViewName("home");
		}
		else
		{
			model.setViewName("user");
		}
		return model;
	}
}
