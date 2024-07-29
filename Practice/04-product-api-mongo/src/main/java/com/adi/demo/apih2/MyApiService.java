package com.adi.demo.apih2;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


//MyApiService.java
@Service
public class MyApiService {
	
	public MyApiResponse fetchDataFromApi() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://fakestoreapi.com/products"; // Replace with the actual API URL
		MyApiResponse result = restTemplate.getForObject(apiUrl, MyApiResponse.class);
		return result; 
	}
	

	// Create a mapper
	

}
