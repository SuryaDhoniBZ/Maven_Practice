package com.testng;

import org.testng.annotations.Test;

public class Timeout_test {
	@Test(timeOut = 7000) //thread . sleep can't exceed more than 7000
	private void login() throws InterruptedException {

		System.out.println("set property");
		Thread.sleep(3000);
		
		System.out.println("browser lanuch");
		
		System.out.println("get url");
		Thread.sleep(2000);
		
		System.out.println("login credentials");
		Thread.sleep(2000);
		
		System.out.println("click login");
		
	}

}
