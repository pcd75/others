package com.nath.service;

import com.nath.dao.ContactDao;

public class ContactServiceImpl implements ContactService {

	private ContactDao dao;
	
	public void setContcatDao(ContactDao dao) {
		this.dao = dao;
	}
	
	@Override
	public String getNameById(Integer id) {
		String name = dao.findNameById(id);
		
		String formattedName = name.toUpperCase();
		
		return formattedName;
	}
	

}
