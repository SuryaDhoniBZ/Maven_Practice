package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_test {
	
	@Test(retryAnalyzer = Retry_class.class)
	private void demo() {
		String expected = "james";
		
		String actual = "jason";
		
		Assert.assertEquals(actual, expected);
		System.out.println("data validation");

	}
	
	
	

	}
