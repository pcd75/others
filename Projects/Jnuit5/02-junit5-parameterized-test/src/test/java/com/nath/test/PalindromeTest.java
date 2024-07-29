package com.nath.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nath.beans.PalindromeCheck;

public class PalindromeTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"radar","madam","asdfghjkl"})
	public void testIsPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual = pc.isPalindrome(str);
		assertTrue(actual);
	}
	
}
