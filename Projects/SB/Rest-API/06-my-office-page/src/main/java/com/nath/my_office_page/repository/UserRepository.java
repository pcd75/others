package com.nath.my_office_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.my_office_page.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
