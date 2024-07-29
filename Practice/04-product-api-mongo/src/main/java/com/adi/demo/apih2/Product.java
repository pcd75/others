package com.adi.demo.apih2;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//MyEntity.java
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Document(collection = "ProductDB")
public class Product {
	
	@Id
	private Integer id;

	@NotBlank
	private String title;

	@Size(max = 100)
	private String description;

	// Getters and setters

}
