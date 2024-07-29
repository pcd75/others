package com.src.dao;

import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.Bus;


@Repository
public class BusDAOImpl implements BusDAO{

    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	@Override
	public void addBus(Bus b) {
	
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(b);
		//logger.info("Bus saved successfully, Bus Details="+b);
		
	}
	@Override
	public void updateBus(Bus b) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(b);
	//	logger.info("Bus updated successfully, BUs Details="+b);
		
	}

	@Override
	public List<Bus> listbuses() {
		
			Session session = this.sessionFactory.getCurrentSession();
			List<Bus> busesList = session.createQuery("from Bus").list();
			for(Bus b : busesList){
			//	logger.info("Bus List::"+t);
			}
			return busesList;
		}
		


	@Override
	public Bus getBusByBusno(int busno) {
		Session session = this.sessionFactory.getCurrentSession();		
		Bus b = (Bus) session.load(Bus.class, new Integer(busno));
		//logger.info("Bus loaded successfully, Bus details="+t);
		return b;
		
	}

	@Override
	public void removeBus(int busno) {
		Session session = this.sessionFactory.getCurrentSession();
		Bus b = (Bus) session.load(Bus.class, new Integer(busno));
		if(null != b){
			session.delete(b);
		}
		//logger.info("Bus deleted successfully, Bus details="+t);
		
	}
	
}
