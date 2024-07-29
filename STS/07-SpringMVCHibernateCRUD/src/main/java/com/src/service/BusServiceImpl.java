package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.BusDAO;
import com.src.model.Bus;

@Service
public class BusServiceImpl implements BusService{
    @Autowired
	private BusDAO busDAO;

	public void setBusDAO(BusDAO busDAO) {
		this.busDAO = busDAO;
	}

	@Override
	@Transactional
	public void addBus(Bus b) {
		this.busDAO.addBus(b);
	}

	@Override
	@Transactional
	public void updateBus(Bus b) {
		this.busDAO.updateBus(b);
	}

	@Override
	@Transactional
	public List<Bus> listBuses() {
		return this.busDAO.listbuses();
	}

	@Override
	@Transactional
	public Bus getBusByBusno(int busno) {
		return this.busDAO.getBusByBusno(busno);
	}

	@Override
	@Transactional
	public void removeBus(int busno) {
		this.busDAO.removeBus(busno);
		Bus bus = null;
		this.busDAO.addBus(bus);

	}

	@Override
	
	public void create(Bus bus) {
		
		this.busDAO.addBus(bus);
	}

	@Override
	public List<Bus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object find(String from, String to, int day, String bustype) {
		// TODO Auto-generated method stub
		return null;
	}
}
