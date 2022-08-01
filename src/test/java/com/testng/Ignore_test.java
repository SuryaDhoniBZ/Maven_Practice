package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_test {
	@Test(enabled = false)
	private void women() {
		System.out.println("women");
	}

	@Ignore
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}

	@Test
	private void dresses() {
		System.out.println("dresses");
	}

	@Test
	private void men() {
		System.out.println("men");
	}

}
