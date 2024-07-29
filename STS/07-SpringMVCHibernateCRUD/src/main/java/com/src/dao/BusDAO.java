package com.src.dao;

import java.util.List;

import com.src.model.Bus;


public interface BusDAO {

	public void addBus(Bus b);
	public void updateBus(Bus b);
	public List<Bus> listbuses();
	public Bus getBusByBusno(int busno);
	public void removeBus(int busno);
}
