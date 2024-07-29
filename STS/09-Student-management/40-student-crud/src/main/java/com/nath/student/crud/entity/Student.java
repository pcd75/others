package com.nath.student.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Size(min = 3, max = 50)
	@Column(name = "first_name")
	private String firstName;

	@Size(min = 3, max = 50)
	@NotBlank(message = "Name is mandatory")
	@Column(name = "last_name")
	private String lastName;

	@NotBlank(message = "Name is mandatory")
	@Email(message = "Please enter a valid e-mail address")
	@Column(name = "email")
	private String email;

	@Column(name = "sui")
	private String sui;

	@Column(name = "dob")
	private String dob;

	@Column(name = "pob")
	private String pob;

	@Column(name = "gender")
	private String gender;

	@Column(name = "address")
	private String address;

	@Column(name = "section")
	private String section;

	@Column(name = "classe")
	private String classe;

	public Student orElseThrow(Object object) {
		return null;
	}

}
