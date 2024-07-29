package com.adi.demo.apih2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDBController {
	
	private ProductDaoService service;
	
	private MyRepository repository;
	
	public ProductDBController(ProductDaoService service, MyRepository repository) {
		this.service = service;
		this.repository = repository;
	}
	
	@GetMapping("/db/products")
	public List<Product> retrieveAllProducts(){
		return repository.findAll();
	}
	
	@GetMapping("/db/products/{id}")
	public Product retrieveProduct(@PathVariable int id) {
		return service.findOne(id);
	}

}
