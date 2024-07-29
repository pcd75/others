package com.nath.webservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.webservice.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
