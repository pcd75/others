package com.nath.sma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Contact;



@Repository()
public interface ContactRepository extends CrudRepository<Contact, Long>{
	Contact findById(long id);
}
