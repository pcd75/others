package com.nath.sma.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity()
public class Classe{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name="classename")
	private String classename;

	@Column(name="sect")
	private String sect;

	public Classe(){}
	
	public Classe(String classename){
		this.classename = classename;
	}
}

	
