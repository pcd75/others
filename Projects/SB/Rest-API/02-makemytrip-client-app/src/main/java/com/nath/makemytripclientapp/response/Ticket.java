package com.nath.makemytripclientapp.response;


import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ticket {
	
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
