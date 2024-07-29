package com.adi.demo.hashmap;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@GetMapping("/")
	public JSONObject getValueById() {
		String url = "https://fakestoreapi.com/products";
		RestTemplate restTemplate = new RestTemplate();
		Product[] products = restTemplate.getForObject(url, Product[].class);
		JSONObject jsonObject = new JSONObject(products);
		
		JSONObject jsonChild1 = (JSONObject) jsonObject.get("id");
		System.out.println(jsonChild1);
		
		Product entity = new Product();
//		//MyResponce[] resp = products;
//		for(int i=0;i<resp.length;i++) {
//			entity.setId(resp[i].getId());
//			entity.setTitle(resp[i].getTitle());
//			entity.setDescription(resp[i].getDescription());
//		}
		return jsonObject;
		
	}
	
//	@GetMapping("/products")
//	public Map<String, Product[]> products(){
//		
//		Map<String, Product[]> productsMap = new HashMap<String, Product[]>();
//		for(Product product:products)
//		{
//			productsMap.put(product.getId(), products);
//		}
//		return productsMap;
//	}
	
//	@GetMapping("/id")
//	public Product[] getById(){
//		HashMap<String, Product[]> productsMap = new HashMap<String, Product[]>();
//		for(Product product:products)
//		{
//			productsMap.put(product.getId(), products);
//		}
//		return productsMap.get("2");
//		
//	}
}
