package com.src.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.Admin;
@Repository
public class AdminDAOImpl implements AdminDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean validate(Admin admin) {
		
		Session session=sessionFactory.getCurrentSession();
		
		Query que=session.createQuery("from Admin where username=:u and password=:p");
		
		que.setParameter("u", admin.getUsername());
		que.setParameter("p", admin.getPassword());
		
		List list=que.list();
		
		boolean b=list.isEmpty();
		
		if(!b)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	}


		
