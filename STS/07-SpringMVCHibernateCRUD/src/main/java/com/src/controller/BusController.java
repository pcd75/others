package com.src.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Bus;
import com.src.service.BusService;



@Controller
public class BusController {
	private static final Logger logger = Logger
			.getLogger(UserController.class);

	public BusController() {
		System.out.println("BusController()");
	}
	@Autowired
	private BusService busService;
	
	
	@RequestMapping(value="/addbus",method=RequestMethod.POST )
	public String addBus1(@ModelAttribute("bus")Bus bus,ModelAndView model)
	{
		
		busService.create(bus);
		return "redirect:/buses";
	}
	
	@RequestMapping(value="/getbuses")
	public @ResponseBody List<Bus> getBuses()
	{
		
		return busService.findAll();
	}
	
	@RequestMapping(value="/updateBus",method=RequestMethod.POST )
	public Map<String,Object>updateTrain(@RequestBody Bus bus)
	{
		Map<String,Object> response =new HashMap<String, Object>();
		try {
		busService.updateBus(bus);
		response.put("message","Bus updated successfully!");
		}
		catch(Exception e) {
			response.put("message", "Update error"+e.toString());
		}
		
		response.put("bus", bus);
		return response;
	}
//	
//	@RequestMapping(value="/getsearchdetails", method=RequestMethod.GET)
//	public Map<String,Object> getsearchdetails(@RequestParam("from") String from,
//			@RequestParam("to") String destinationStation,
//			
//			@RequestParam("bustype") String bustype,
//			@RequestParam("day") int day){
//		Map<String,Object> response =new HashMap<String, Object>();
//		try {
//		
//		response.put("message","Search successful!");
//		response.put("list", busService.find(from, to, day, bustype));
//		}
//		catch(Exception e) {
//			response.put("message", "Error"+e.toString());
//		}
//		
//		
//		return response;
//		
//			
//		
//	}
//	
//
	@RequestMapping(value = "/buses", method = RequestMethod.GET)
	public String listBuses(Model model) {
		model.addAttribute("bus", new Bus());
		model.addAttribute("listBuses", this.busService.listBuses());
		return "bus";
	}
	
}
