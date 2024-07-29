package com.adi.demo.apih2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductDaoService {
	
	String url = "https://fakestoreapi.com/products";
	RestTemplate restTemplate = new RestTemplate();
	Product[] result = restTemplate.getForObject(url, Product[].class);
	
	List<Product> products = Arrays.asList(result);
	
	
	public List<Product> findAll(){
		return products;
	}
	
	public Product findOne(int id) {
		Predicate<? super Product> predicate = product -> product.getId().equals(id);
		return products.stream().filter(predicate).findFirst().get();
	}
}
