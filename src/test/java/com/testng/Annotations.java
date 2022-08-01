package com.testng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeSuite
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	}

	@BeforeTest
	private void browserLaunch() {
		WebDriver driver = new ChromeDriver();
	}

	@BeforeClass
	private void getUrl() {

	}
}
