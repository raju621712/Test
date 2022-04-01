package com.Exception;

import org.testng.annotations.Test;

public class Exceptionpgm {
	
	@Test
	private void adD() {
		
		int a=10;
		int b=15;
		System.out.println("Add :" +(a+b));

	}

	@Test(expectedExceptions = Exception.class)
	private void diviDe() {
		
		int a=10;
		int b=0;
		System.out.println("divide :"+ (a/b));

	}
}
