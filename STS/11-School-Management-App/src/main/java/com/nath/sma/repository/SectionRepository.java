package com.nath.sma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Section;

@Repository
public interface SectionRepository extends CrudRepository<Section, Long>{
    Section findById(long id);
}