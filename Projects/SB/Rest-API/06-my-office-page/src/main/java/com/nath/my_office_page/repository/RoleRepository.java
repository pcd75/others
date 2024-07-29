package com.nath.my_office_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.my_office_page.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
