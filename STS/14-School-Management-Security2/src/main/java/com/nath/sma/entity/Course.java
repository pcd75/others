package com.nath.sma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class Course{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long coid;

	@Column(name="coname")
	private String coname;

	public Course(){}

	public long getId(){
		return coid;
	}

	public void setId(long coid){
		this.coid = coid;
	}

	public String getConame(){
		return coname;
	}

	public void setConame(String coname){
		this.coname = coname;
	}
}