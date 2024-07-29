package com.nath.webservice.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
	
	private Integer id;
	
	@Size(min=2, message = "Name should have atleat 2 character")
	@JsonProperty("user_name")
	private String name;
	
	@Past(message = "Birthdate date ")
	private LocalDate birthDate;

}
