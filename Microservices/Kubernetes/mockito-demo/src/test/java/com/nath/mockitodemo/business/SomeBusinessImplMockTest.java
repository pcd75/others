package com.nath.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest{

	@Test
	void findGreatestFromAllData(){
		DataService dataSerrviveMock = mock(DataService.class);
		when(dataSerrviveMock.retriveAllData()).thenReturn(new int[] {12,5,45,8,6,40});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataSerrviveMock);
		assertEquals(45, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findGreatestFromAllData_OneValue() {
		DataService dataSerrviveMock = mock(DataService.class);
		when(dataSerrviveMock.retriveAllData()).thenReturn(new int[] {12});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataSerrviveMock);
		assertEquals(12, businessImpl.findTheGreatestFromAllData());
	}
	
}
