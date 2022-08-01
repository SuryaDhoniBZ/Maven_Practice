package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set property");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void getUrl() {
		System.out.println("Get url");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("Sign in");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void dresses() {
		System.out.println("Dresses");
	}

	@Test
	private void tshirts() {
		System.out.println("tshirts");
	}

	@AfterMethod
	private void signoff() {
		System.out.println("Sign off");
	}

	@AfterClass
	private void homepage() {
		System.out.println("Homepage");
	}

	@AfterTest
	private void close() {
		System.out.println("Close");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
}
