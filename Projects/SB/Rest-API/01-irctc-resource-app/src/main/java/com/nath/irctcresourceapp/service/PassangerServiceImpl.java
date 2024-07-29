package com.nath.irctcresourceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.irctcresourceapp.model.Passanger;
import com.nath.irctcresourceapp.model.Ticket;
import com.nath.irctcresourceapp.repository.PassangerRepository;

@Service
public class PassangerServiceImpl implements PassangerSevice {
	
	@Autowired
	private PassangerRepository passangerRepo;

	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger save = passangerRepo.save(psg);

		if (save != null) {
			Ticket t = new Ticket();
			t.setPnr("12345678");
			t.setTicketStatus("BOOOKED");
			t.setPrice(987.0);
			return t;
		} else {
			return null;
		}
		
	}
}
