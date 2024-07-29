package com.nath.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nath.beans.EvenOrOdd;

public class EvenOrOddTest {
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void evenOrOddTest(String input, String expected) {
		EvenOrOdd eoo = new EvenOrOdd();
		String actual = eoo.evenOrOddNum(Integer.parseInt(input));
		assertEquals(expected, actual);
		
	}

}
