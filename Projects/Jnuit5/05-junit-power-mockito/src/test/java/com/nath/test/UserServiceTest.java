package com.nath.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.nath.dao.UserDao;
import com.nath.service.UserService;

public class UserServiceTest {

	@Test
	public void testGetNameByUserId() {
		UserDao mockDao = PowerMockito.mock(UserDao.class);

		PowerMockito.when(mockDao.findNameById(101)).thenCallRealMethod();
		UserService service = new UserService(mockDao);
		String name = service.getNameByUserId(101);
		assertEquals("John", name);
	}

	@Test
	public void testGetEmailByUserId() {
		UserDao mockDao = PowerMockito.mock(UserDao.class);

		PowerMockito.when(mockDao.findEmailById(101)).thenReturn("nick.asd@gmail.com");

		UserService service = new UserService(mockDao);
		String email = service.getEmailByUserId(101);
		assertEquals("nick.asd@gmail.com", email);

	}

}
