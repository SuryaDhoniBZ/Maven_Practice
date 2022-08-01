package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@Test(dataProvider = "data")
	private void credentials(String username,String password) {

		System.out.println("username is : "+ username);
		System.out.println("Password is : "+ password);
	}
	@DataProvider
	private Object[][] data() {

		return new Object[][] {
			{"Surya","Surya@123"},
			{"Dhoni","Dhoni@7"},
			{"Virat","Virat@18"}
		};
	}

}
