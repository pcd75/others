package com.nath.makemytripclientapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nath.makemytripclientapp.response.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer>{

}
