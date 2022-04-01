package com.Parametersied;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersiedPgm {
	
	//method 1
	
	@Test
	@Parameters({"empname" , "empid"})

	private void employeeDetails(@Optional("raju") String empname, int empid) {
		
		System.out.println("Employee name is :"+empname );
		System.out.println("Employee Id is :"+empid);
		
		
		
	
		
		
		
		

	}
	
}
