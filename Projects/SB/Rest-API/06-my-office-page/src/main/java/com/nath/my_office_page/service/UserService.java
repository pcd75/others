package com.nath.my_office_page.service;

import java.util.List;

import com.nath.my_office_page.dto.UserDto;
import com.nath.my_office_page.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
