package com.InvocationCount;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	private void criCket() {
		
		System.out.println("MSD");
		
		}
	
	@Test(invocationCount = 5)
	private void footBall() {
	
		System.out.println("Nymar Jr");

	}

	@Test
	private void acTor() {
		
		System.out.println("Vijay");
		

	}
	
}
