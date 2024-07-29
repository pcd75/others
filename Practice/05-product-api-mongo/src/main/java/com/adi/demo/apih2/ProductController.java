package com.adi.demo.apih2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private ProductDaoService service;
	
	public ProductController(ProductDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/products")
	public List<Product> retrieveAllProducts(){
		return service.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Product retrieveProduct(@PathVariable int id) {
		return service.findOne(id);
	}
	
	

}
