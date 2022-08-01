package com.testng;

import org.testng.annotations.Test;

public class Grouping_test {

	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");
	}

	@Test(groups = "music")
	private void wynk() {
		System.out.println("wynk");
	}

	@Test(groups = "shopping")
	private void dresses() {
		System.out.println("dresses");
	}

	@Test(groups = "shopping")
	private void tshirt() {
		System.out.println("tshirt");
	}

	@Test
	private void books() {
		System.out.println("books");
	}

}
