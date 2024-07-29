package com.nath.ims.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	@NotBlank(message = "Name is mandatory")
	@Column(name = "fullname")
	private String fullname;

	@NotBlank(message = "Email is mandatory")
	@Column(name = "email")
	private String email;

//	@Column(name = "phoneno")
//	private String phoneno;
//
//	@Column(name = "sui")
//	private String sui;
//
//	@Column(name = "dob")
//	private String dob;
//
//	@Column(name = "pob")
//	private String pob;
//
//	@Column(name = "gender")
//	private String gender;
//
//	@Column(name = "address")
//	private String address;
//
//	@Column(name = "section")
//	private String section;
//
//	@Column(name = "classe")
//	private String classe;

	public Student(String fullname, String email) {
		this.fullname = fullname;
		this.email = email;
	}

	public Student orElseThrow(Object object) {
		return null;
	}

}
