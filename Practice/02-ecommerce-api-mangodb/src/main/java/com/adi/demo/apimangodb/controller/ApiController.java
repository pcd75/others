package com.adi.demo.apimangodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.adi.demo.apimangodb.dto.MyApiResponse;
import com.adi.demo.apimangodb.entity.Product;
import com.adi.demo.apimangodb.repository.ProductRepository;
import com.adi.demo.apimangodb.service.ProductService;

@RestController
public class ApiController {

	private final ProductService myService;
    private final ProductRepository myRepository;
	
	
	    public ApiController(ProductService myService, ProductRepository myRepository) {
	        this.myService = myService;
	        this.myRepository = myRepository;
	    }

	@GetMapping("/callclienthello")
	public String callExternalAPI() {
		RestTemplate restTemplate = new RestTemplate();
		String externalApiUrl = "https://fakestoreapi.com/products"; // Replace with the actual API URL

		// Make the external API call
		String response = restTemplate.getForObject(externalApiUrl, String.class);

		// Save the response data to your database
		Product entity = new Product();
		//entity.setData(response);
//		entity.setTitle(response.getTitle());
//		entity.setDescription(response.getDescription());
		myRepository.save(entity);

		return "Data saved successfully!";
	}
	
	@GetMapping("/fetch-and-save")
	public String fetchAndSaveData() {
		MyApiResponse apiResponse = myService.fetchDataFromApi();

		Product entity = new Product();
		entity.setTitle(apiResponse.getTitle());
		entity.setDescription(apiResponse.getDescription());

		myRepository.save(entity);

		return "Data saved successfully!";
	}

}
