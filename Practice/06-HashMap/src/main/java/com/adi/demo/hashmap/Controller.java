package com.adi.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;

@RestController
public class Controller {
	
	String url = "https://fakestoreapi.com/products";
	RestTemplate restTemplate = new RestTemplate();
	Product[] products = restTemplate.getForObject(url, Product[].class);

	@GetMapping("/")
	public Map<String, Product[]> products(){
		
		Map<String, Product[]> productsMap = new HashMap<String, Product[]>();
		for(Product product:products)
		{
			productsMap.put(product.getId(), products);
		}
		return productsMap;
	}
	
	@GetMapping("/id")
	public Product[] getById(){
		HashMap<String, Product[]> productsMap = new HashMap<String, Product[]>();
		for(Product product:products)
		{
			productsMap.put(product.getId(), products);
		}
		
		return productsMap.get("2");
		
	}
}
