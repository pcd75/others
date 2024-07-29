package com.nath.student_mange.entity;

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

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 3, max = 50)
    @Column(name = "first_name")
    private String firstName;

    @Size(min = 3, max = 50)
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
	@Email(message = "Please enter a valid e-mail address")
    @Column(name = "email")
    private String email;
    
    @NotBlank
    @Column(name="qualification")
    private String qualification;

}
