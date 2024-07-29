package com.nath.irctcresourceapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Passanger {
	
	@Id
	private int pid;
	
	private String firstName;
	
	private String lastName;
	
	private String from;
	
	private String to;
	
	private String doj;

}
