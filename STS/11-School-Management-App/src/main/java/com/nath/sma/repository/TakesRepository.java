package com.nath.sma.repository;

import org.springframework.data.repository.CrudRepository;

import com.nath.sma.entity.Takes;

public interface TakesRepository extends CrudRepository<Takes, Long> {
    Takes findById(long id);
}
