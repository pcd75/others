package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.UserDAO;
import com.src.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean validate1(User user) {
		
		return userDAO.validate1(user);
	}
		

	
}
