package com.adi.demo.apimangodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adi.demo.apimangodb.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
	
}
