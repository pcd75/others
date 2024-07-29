package com.nath.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findGreatestFromAllData() {
		DataServiceStub1 dataSevieStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataSevieStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(45, result);
	}
	
	@Test
	void findGreatestFromOneLine() {
		DataServiceStub2 dataSevieStub = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataSevieStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(20, result);
	}
	
	
}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retriveAllData() {
		return new int[] { 20, 45, 7, 8, 5 };
	}
}

class DataServiceStub2 implements DataService {

	@Override
	public int[] retriveAllData() {
		return new int[] {20};
	}
}
