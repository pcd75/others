package com.adi.demo.apimangodb.service;

import java.util.List;

import com.adi.demo.apimangodb.dto.MyApiResponse;
import com.adi.demo.apimangodb.entity.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
	
	public MyApiResponse fetchDataFromApi();
	
}
