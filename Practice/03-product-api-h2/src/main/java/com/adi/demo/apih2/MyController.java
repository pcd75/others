package com.adi.demo.apih2;

import org.springframework.beans.factory.annotation.Autowired;
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
		String url = "https://catfact.ninja/fact";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}

	@GetMapping("/fetch")
	public String fetchAndSaveData() {
		MyApiResponse apiResponse = apiService.fetchDataFromApi();

		MyEntity entity = new MyEntity();
		entity.setFact(apiResponse.getFact());
		entity.setLength(apiResponse.getLength());

		repository.save(entity);

		return "Data saved successfully!";
	}
}
