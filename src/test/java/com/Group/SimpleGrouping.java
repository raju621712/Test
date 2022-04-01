package com.Group;

import org.testng.annotations.Test;

public class SimpleGrouping {
	
	
	@Test(groups = "Employee Details")
	private void empId() 
	{	
		System.out.println("The Emp Id Is: 19");
		}
	@Test(groups = "Employee Details")
	private void empName() {
		
		System.out.println("The Employee Name is Raju");
		}
	
	
	@Test(groups = "Personal Details")
	private void personalAddress() {
		
		System.out.println("Newyork");
		}
	
	@Test(groups = "Personal Details")
	private void personalNumber() {
		
		System.out.println("9876543210");
		}
	
	
	@Test(groups = "Bank Details")
	private void bankNumber() {
		System.out.println("321654987456321");
	}
	
	@Test
	private void iFsc() {
		System.out.println("IFSC code");

	}
	
}
