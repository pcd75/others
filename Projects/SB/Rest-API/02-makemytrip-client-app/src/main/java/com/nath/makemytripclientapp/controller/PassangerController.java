package com.nath.makemytripclientapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nath.makemytripclientapp.response.Passanger;
import com.nath.makemytripclientapp.response.Ticket;
import com.nath.makemytripclientapp.service.PassangerServiceImpl;

@RestController
public class PassangerController {
	
	@Autowired
	private PassangerServiceImpl passangerServiceImpl;
	
	@GetMapping("/")
	public String home() {
		return "Make My Trip";
	}
	
//	@PostMapping("/bookTicket")
//	public void bookTicket(Passanger psg) {
//		passangerServiceImpl.bookTicket(psg);
//	}
	
	@PostMapping("/bookTicket")
	public ResponseEntity<Ticket> bookTicket(Passanger psg) {
		Ticket ticket =  passangerServiceImpl.bookTicketTemplate(psg);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
//	
//	
//	
	@PostMapping("/bookTicketWeb")
	public ResponseEntity<Ticket> bookTicketWeb(Passanger psg){
		Ticket ticket = passangerServiceImpl.bookTicketWebClient(psg);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	

}
