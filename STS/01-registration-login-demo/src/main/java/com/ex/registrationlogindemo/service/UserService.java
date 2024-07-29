package com.ex.registrationlogindemo.service;

import java.util.List;

import com.ex.registrationlogindemo.dto.UserDto;
import com.ex.registrationlogindemo.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
