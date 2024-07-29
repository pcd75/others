package com.src.service;

import java.util.List;

import com.src.model.Admin;

public interface AdminServiceI {

	
	public boolean validate(Admin ad);

	public List<Admin> findAll();

	public Object find(String from, String to, int day, String bustype);

	public void updateBus(Admin bus);

	public void create(Object bus);

	public Object listBuses();

	
	
}
