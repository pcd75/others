package com.nath.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.nath.beans.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void convertedToNullParameter() {
		String str = null;
		assertThrows(IllegalArgumentException.class, () -> StringUtils.convertedToString(str));
	}

}
