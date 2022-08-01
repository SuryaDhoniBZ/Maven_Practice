package com.testng;

import org.testng.annotations.Test;

public class Invocation_count {

	@Test(priority = 0,invocationCount = 3)
	private void refresh() {
		System.out.println("refresh");
	}

	@Test
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@Test(priority = 1)
	private void getUrl() {
		System.out.println("Get url");
	}

	@Test(priority = 2)
	private void signin() {
		System.out.println("Sign in");
	}

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Set property");
	}

	@Test(priority = 3)
	private void men() {
		System.out.println("women");
	}

}
