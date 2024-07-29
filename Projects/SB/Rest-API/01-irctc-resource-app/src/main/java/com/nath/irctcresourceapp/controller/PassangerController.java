package com.nath.irctcresourceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nath.irctcresourceapp.model.Passanger;
import com.nath.irctcresourceapp.model.Ticket;
import com.nath.irctcresourceapp.service.PassangerServiceImpl;

@RestController
public class PassangerController {
	
	@Autowired
	private PassangerServiceImpl passangerServiceImpl;
	
	@GetMapping("/")
	public String home() {
		return "IRCTC";
	}
	
	@PostMapping("/bookTicket")
	public Ticket bookTicket(Passanger psg) {
		Ticket bookTicket = passangerServiceImpl.bookTicket(psg);
		return bookTicket;
	}

	@PostMapping("/bookTicketWebClient")
	public ResponseEntity<Ticket> bookTicketWebClient(@RequestBody Passanger psg){
		Ticket bookTicket = passangerServiceImpl.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
		
	}
	
	
}

