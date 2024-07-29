package com.src.service;

import java.util.List;

import com.src.model.Bus;

public interface BusService {

	public void addBus(Bus b);
	public void updateBus(Bus b);
	public List<Bus> listBuses();
	public Bus getBusByBusno(int busno);
	public void removeBus(int busno);
	public void create(Bus bus);
	public List<Bus> findAll();
	public Object find(String from, String to, int day, String bustype);


}
