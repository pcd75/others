package com.nath.irctcresourceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nath.irctcresourceapp.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer>{

}
