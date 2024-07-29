package com.adi.demo.apimangodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adi.demo.apimangodb.dto.MyApiResponse;
import com.adi.demo.apimangodb.entity.Product;
import com.adi.demo.apimangodb.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

//	
//	private final RestTemplate restTemplate;
//
//	@Autowired
//	public MyApiService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> productDb = this.productRepository.findById(product.getId());

		if (productDb.isPresent()) {
			Product productUpdate = productDb.get();
			productUpdate.setId(product.getId());
			productUpdate.setTitle(null);
			productUpdate.setDescription(product.getDescription());
			productRepository.save(productUpdate);
			return productUpdate;
		}
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(long productId) {

		Optional<Product> productDb = this.productRepository.findById(productId);

		if (productDb.isPresent()) {
			return productDb.get();
		}
		return null;
	}

	@Override
	public void deleteProduct(long productId) {
		Optional<Product> productDb = this.productRepository.findById(productId);

		if (productDb.isPresent()) {
			this.productRepository.delete(productDb.get());
		}
	}

	public MyApiResponse fetchDataFromApi() {
		String url = "https://fakestoreapi.com/products"; // Replace with the actual API URL
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, MyApiResponse.class);
	}

}
