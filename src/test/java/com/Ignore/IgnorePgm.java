package com.Ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnorePgm {
	
	
	//Method 1
	@Ignore
	@Test
	private void sHoes() {
		System.out.println("Search Shoes");
		
		

	}
	
	@Test
	private void wAtch() {
		System.out.println("Watches");

	}

	@Test
	private void laPtop() {
		System.out.println("Search Laptop");

	}
	
	
	//Method 2
	@Test(enabled = false)
	private void rEdmi() {
		System.out.println("Redmi note 7 pro");

	}
}
