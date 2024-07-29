package com.nath.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTestWithAnnotations {
	
	@Mock
	private DataService dataServiveMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findGreatestFromAllData() {
		when(dataServiveMock.retriveAllData()).thenReturn(new int[] {12,5,45,8,6,40});
		assertEquals(45, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findGreatestFromAllData_OneValue() {
		when(dataServiveMock.retriveAllData()).thenReturn(new int[] {12});
		assertEquals(12, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findGreatestFromAllData_EmptyArray() {
		when(dataServiveMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}
	
}
