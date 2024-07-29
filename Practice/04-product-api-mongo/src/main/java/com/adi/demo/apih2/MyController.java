package com.adi.demo.apih2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//MyController.java
@RestController
public class MyController {
	private final MyApiService apiService;
	private final MyRepository repository;

	@Autowired
	public MyController(MyApiService apiService, MyRepository repository) {
		this.apiService = apiService;
		this.repository = repository;
	}

	@GetMapping("/getproducts")
	public String getProducts() {
		String url = "https://fakestoreapi.com/products";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}

	@GetMapping("/fetch")
	public String fetchAndSaveData()  {
		MyApiResponse apiResponse = apiService.fetchDataFromApi();
		Product product = new Product();
 
		//product.setId(apiResponse.getId());
		product.setTitle(apiResponse.getTitle());
		product.setDescription(apiResponse.getDescription());

		repository.save(product);

		return "Data saved successfully!";
	}
	
	@GetMapping("/getprod")
	public List<Product> getProduct() {
		String url = "https://fakestoreapi.com/products";
		RestTemplate restTemplate = new RestTemplate();
		Product[] result = restTemplate.getForObject(url, Product[].class);
		return Arrays.asList(result);
	}
	
	@GetMapping("/getp")
	public Product getAllProducts() {
		HashMap<String, String> map = new HashMap<>();
		ResponseEntity<Product> forEntity = new RestTemplate().getForEntity("https://fakestoreapi.com/products", Product.class, map);
		Product body = forEntity.getBody();
		return new Product(body.getId(),body.getTitle(),body.getDescription());
		
	}
}
