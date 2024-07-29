package com.nath.cms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Size(min = 3, max = 50)
    @Column(name = "full_name")
	private String fullName;
	

    @NotBlank
	@Email(message = "Please enter a valid e-mail address")
    @Column(name = "email")
	private String email;
    
    @Column(name = "phoneno")
	private String phoneno;
    
    @Column(name="gender")
	private String gender;
}
