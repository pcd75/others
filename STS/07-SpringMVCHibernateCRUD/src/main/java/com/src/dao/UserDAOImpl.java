package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.User;
@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean validate1(User user) {
		
		Session session=sessionFactory.getCurrentSession();
		
		Query que=session.createQuery("from User where username=:u and password=:p");
		
		que.setParameter("u", user.getUsername());
		que.setParameter("p", user.getPassword());
		
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
