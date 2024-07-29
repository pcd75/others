package com.nath.sma.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Classe;


@Repository
public interface ClasseRepository extends CrudRepository<Classe, Long>{
    Classe findById(long id);
}