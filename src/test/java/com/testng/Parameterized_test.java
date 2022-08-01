package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_test {
	
	@Parameters({"username","password"})
	@Test
	private void credentials(String username,String password) {


			System.out.println("username is : "+ username);
			System.out.println("Password is : "+ password);
		}
	}


