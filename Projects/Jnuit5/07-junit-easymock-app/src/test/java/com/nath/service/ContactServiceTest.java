package com.nath.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.nath.dao.ContactDao;

public class ContactServiceTest {
	
	@Test
	public void testGetnameById() {
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("asd");
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setContcatDao(daoProxy);
		String name = service.getNameById(101);
		assertNotNull(name);
	}

}
