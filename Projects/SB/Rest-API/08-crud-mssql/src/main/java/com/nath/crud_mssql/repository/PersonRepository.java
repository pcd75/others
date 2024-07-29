package com.nath.crud_mssql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.crud_mssql.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
