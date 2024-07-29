package com.nath.sma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Section{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long secid;

	@Column(name = "secname")
	private String secname;

	public Section(){}

	public void setSecId(long secid){
		this.secid = secid;
	}

	public long getSecId(){
		return secid;
	}

	public void setSecName(String secname){
		this.secname = secname;
	}

	public String  getSecName(){
		return secname;
	}
	
}