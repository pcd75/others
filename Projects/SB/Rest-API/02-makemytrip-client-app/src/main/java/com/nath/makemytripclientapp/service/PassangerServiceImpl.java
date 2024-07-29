package com.nath.makemytripclientapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.nath.makemytripclientapp.repository.PassangerRepository;
import com.nath.makemytripclientapp.response.Passanger;
import com.nath.makemytripclientapp.response.Ticket;

@Service
public class PassangerServiceImpl implements PassangerService {

	@Autowired
	private PassangerRepository passangerRepo;
	
	@Override
	public Ticket bookTicketTemplate(Passanger psg) {
		passangerRepo.save(psg);

		String url = "http://localhost:7777/bookTicket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, psg, Ticket.class);
		Ticket ticket = postForEntity.getBody();

		return ticket;
	}
	
	public Ticket bookTicketWebClient(Passanger psg) {
		passangerRepo.save(psg);
		
		String url = "http://localhost:7777/bookticket";
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
					.uri(url)
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.body(BodyInserters.fromValue(psg))
					.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		return ticket;
	}
		

}
