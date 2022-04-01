package com.Priority;

import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority = 3)
	private void sHoes() {
		System.out.println("Search Shoes");
			

	}
	
	@Test(priority = 2)
	private void wAtch() {
		System.out.println("Watches");

	}

	@Test(priority = 1)
	private void laPtop() {
		System.out.println("Search Laptop");

	}
	
	
	@Test(priority = 0)
	private void rEdmi() {
		System.out.println("Redmi note 7 pro");

	}
	@Test(priority = -1)
	private void headSet() {
		System.out.println("Boat");

	}
	
	
	@Test(priority = -2)
	private void elecTronics() {
		System.err.println("keyboatd");
		

	}
	@Test(priority = 0)
	private void caR() {
		System.out.println("Audi");

	}


}
