package com.nath.dao;

public class UserDaoImpl implements UserDao {

	@Override
	public String findNameById(Integer id) {
		System.out.println("FindByName is called");
		return "John";
	}

	@Override
	public String findEmailById(Integer id) {
		System.out.println("FindByEMail is called");
		return "john.asd@gmail.com";
	}

}
