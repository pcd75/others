package com.nath.webservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.webservice.user.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
