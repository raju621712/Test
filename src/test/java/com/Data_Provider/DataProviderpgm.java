package com.Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderpgm {
	
	
	@Test(dataProvider = "raju")
	private void testdata(String empname, int empid) {
		
		System.out.println("Employee name is :"+empname);
		System.out.println("Employee id :"+empid);
		

	}

	@DataProvider
	private Object[][] raju() {
		return new Object[][]{{"raju", 19},{"sekar",69}
		
		};
		
		

	}
}
