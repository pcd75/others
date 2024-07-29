package com.adi.demo.apimangodb.entity;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Document(collection = "ProductDB")
public class Product {
	
	@Id
	private Long id;
	
	@NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
	private String title;
	
	@NotBlank
	private BigDecimal price;
	
	private String description;
	
	private String category;

	
	
}
