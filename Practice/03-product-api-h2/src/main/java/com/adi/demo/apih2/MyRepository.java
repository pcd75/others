package com.adi.demo.apih2;

import org.springframework.data.mongodb.repository.MongoRepository;

//MyRepository.java
public interface MyRepository extends MongoRepository<MyEntity, String> {
 // Add custom methods if needed
}

