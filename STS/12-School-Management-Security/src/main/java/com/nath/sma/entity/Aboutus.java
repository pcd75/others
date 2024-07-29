package com.nath.sma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aboutus {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name="name")
	private String name;
    
}
