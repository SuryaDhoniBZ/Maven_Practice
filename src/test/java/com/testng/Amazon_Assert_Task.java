package com.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Amazon_Assert_Task {

	@Test
	private void Amazon_Assert() {

		String expected = "OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage)";

		String actual = "        OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage)       ";

		assertEquals(actual, expected);
		System.out.println("Matched");
	}

}
