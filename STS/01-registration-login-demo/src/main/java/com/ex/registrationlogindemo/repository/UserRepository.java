package com.ex.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.registrationlogindemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
