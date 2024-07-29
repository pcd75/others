package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.AdminDAO;

import com.src.model.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminServiceI {

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public boolean validate(Admin admin) {
		
		return adminDAO.validate(admin);
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object find(String from, String to, int day, String bustype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBus(Admin bus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Object bus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object listBuses() {
		// TODO Auto-generated method stub
		return null;
	}

}
