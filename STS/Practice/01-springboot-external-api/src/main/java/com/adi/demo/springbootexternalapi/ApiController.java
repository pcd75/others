package com.adi.demo.springbootexternalapi;

import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
	
	@GetMapping("/he")
	public String hello() {
		return "QWERTYUIOPLKJHGFDSAZXCVBNM";
	}
	
	@GetMapping("/callclient")
	public String clientHello() {
		String url = "http://localhost:8080/he";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	
	@GetMapping("/university")
	public List<Object> getuniversityList() {
		String uri = "http://universities.hipolabs.com/search?country=United+States";
		RestTemplate restTemplate = new RestTemplate();
		Object[] university = restTemplate.getForObject(uri, Object[].class);
		return Arrays.asList(university) ;
	}
	
	@GetMapping("/exchange-rates")
	public String getExchange() {
		String uri = "https://api.coingecko.com/api/v3/exchange_rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result ;	
	}
	
	@GetMapping("/rates")
	public String getExchangeRates() {
		String uri = "http://localhost:8080/exchange-rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild1 = (JSONObject) jsonObject.get("rates");
		return jsonChild1.toString();
	}
	
	@GetMapping("/rates1")
	public String getRates(){//@PathVariable String name) {
		String uri = "http://localhost:8080/exchange-rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild1 = (JSONObject) jsonObject.get("rates");
		JSONObject jsonChild2 = (JSONObject) jsonChild1.get("btc");
		return jsonChild2.toString();
	}
	
	@GetMapping("/coin")
	public String getRatesCoin() {
		String uri = "http://localhost:8080/rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild = (JSONObject) jsonObject.get("usd");
		return jsonChild.toString();
	}
	
	@GetMapping("/coin/{name}")
	public String getCoin(@PathVariable String name) {
		String uri = "http://localhost:8080/rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild = (JSONObject) jsonObject.get(name);
		return jsonChild.toString();
	}
	
	@GetMapping("/coin/{name}/data")
	public String getCoinData(@PathVariable String name) {
		String uri = "http://localhost:8080/rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild = (JSONObject) jsonObject.get(name);
		Object jsonChild2 = jsonChild.get("name");
		//String jsonChild2 = (String) jsonChild.get("type");
		return jsonChild2.toString();
	}
	
	@GetMapping("/coin/{id}/{value}")
	public String getCoinDataa(@PathVariable String id,@PathVariable String value) {
		String uri = "http://localhost:8080/rates";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		JSONObject jsonChild = (JSONObject) jsonObject.get(id); 
		Object jsonChild2 = jsonChild.get(value);
		return jsonChild2.toString();
	}
	
	
}
