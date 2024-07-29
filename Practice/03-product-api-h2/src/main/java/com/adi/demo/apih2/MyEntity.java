package com.adi.demo.apih2;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

//MyEntity.java
@Getter
@Setter
@Entity
@Document(collection = "ProductDB")
public class MyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@NotBlank
	private String fact;

	@Size(max = 100)
	private String length;

	// Getters and setters

}
