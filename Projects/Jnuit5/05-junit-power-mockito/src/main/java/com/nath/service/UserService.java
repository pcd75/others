package com.nath.service;

import com.nath.dao.UserDao;

public class UserService {

	private UserDao dao;
	
	public UserService() {
		
	}

	public UserService(UserDao dao) {
		this.dao = dao;
	}

	public String getNameByUserId(Integer id) {
		String name = dao.findNameById(id);
		return name;
	}
	
	public String getEmailByUserId(Integer id) {
		String email = dao.findEmailById(id);
		return email;
	}

}
