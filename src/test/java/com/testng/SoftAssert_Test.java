package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Test {

	@Test
	private void demo() {

		String actual = "James";
		String expected = "jason";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actual, expected);
		sa.assertAll();
		
		System.out.println("Data validation");
	}

}
