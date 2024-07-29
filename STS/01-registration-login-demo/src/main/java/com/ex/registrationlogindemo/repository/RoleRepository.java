package com.ex.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.registrationlogindemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
