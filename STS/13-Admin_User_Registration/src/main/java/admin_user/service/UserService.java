package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.entity.User;

public interface UserService {
	
	User save (UserDto userDto);
	

}
