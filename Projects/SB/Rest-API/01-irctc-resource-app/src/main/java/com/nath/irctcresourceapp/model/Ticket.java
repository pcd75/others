package com.nath.irctcresourceapp.model;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Ticket {
	@Id
	private int ticketId;
	
	private String pnr;
	
	private String ticketStatus;
	
	private double price;
	
	public String generatePnr() {
		Random random = new Random(); 
	    long randomNumber = Math.abs(random.nextLong()); 
	    String randomString = Long.toString(randomNumber); 
	    String pnrNum = randomString.substring(0, 10);
	    
	    return pnrNum;
	}
	
	

}
