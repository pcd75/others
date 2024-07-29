package com.adi.demo.apih2;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//MyApiService.java
@Service
public class MyApiService {
	
	public MyApiResponse fetchDataFromApi() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://catfact.ninja/fact"; // Replace with the actual API URL
		return restTemplate.getForObject(apiUrl, MyApiResponse.class);
	}
}
