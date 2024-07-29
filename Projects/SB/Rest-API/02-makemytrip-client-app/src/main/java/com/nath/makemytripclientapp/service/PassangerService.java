package com.nath.makemytripclientapp.service;

import com.nath.makemytripclientapp.response.Passanger;
import com.nath.makemytripclientapp.response.Ticket;

public interface PassangerService {
	
//	public Ticket bookTicket(Passanger psg);
	
	public Ticket bookTicketTemplate(Passanger psg);
	
	public Ticket bookTicketWebClient(Passanger psg);

}
