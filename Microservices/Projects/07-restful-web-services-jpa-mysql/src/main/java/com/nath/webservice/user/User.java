package com.nath.webservice.user;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity(name="user_details")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message = "Name should have atleat 2 character")
	//@JsonProperty("user_name")
	private String name;
	
	@Past(message = "Birthdate date ")
	private LocalDate birthDate;
	
	
	
	public User(Integer id, @Size(min = 2, message = "Name should have atleat 2 character") String name,
			@Past(message = "Birthdate date ") LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}



	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private List<Role> roles;

}
