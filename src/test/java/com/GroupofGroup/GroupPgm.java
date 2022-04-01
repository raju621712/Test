package com.GroupofGroup;

import org.testng.annotations.Test;

public class GroupPgm {
	
	
	@Test(dependsOnGroups = "b")
	private void hellO() {
		
		System.out.println("Welcome to the Government Bus Showroom");
	

	}
	
	@Test(dependsOnGroups = "z")
	private void welcOme() {
		
		System.out.println("Welcome to the Private Bus Showroom");
		
}
	
	@Test(groups = "z")	
	private void omNi() {
		
		System.out.println("Volvo");
		

	}
	
@Test(groups = "b")
	private void tnState() {
	
	System.out.println("Local Bus");
		

	}


@Test(groups = "b")
private void tnSt() {
	
	System.out.println("TNSTC");
	

}
	
}
