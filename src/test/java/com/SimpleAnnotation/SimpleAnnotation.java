package com.SimpleAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
		
		@BeforeSuite
		private void setup() {
			System.out.println("Chrome Driver Setup");
			

		}
		@BeforeTest
		private void urL() {
			System.out.println("Amazon url passed");
		

		}
		@BeforeClass
		private void singIn() {
			System.out.println("SingIn");

		}
		@BeforeMethod
		private void homePage() {
			
			System.out.println("Go To Amazon page");
			

		}
		@Test
		private void shoes() {
			System.out.println("Search shoes");
			

		}
		
		@Test
		private void bat() {
			System.out.println("Search bat");

		}
		
		@AfterMethod
		private void screenSoht() {
			System.out.println("Screenshot");

		}
	
		@AfterClass
		private void signOut() {
			System.out.println("Sign out the page");

		}
		
		@AfterTest
		private void deleteCoo() {
			System.out.println("Delete the Cookies");

		}
		
		@AfterSuite
		private void quite() {
			System.out.println("Quite the browser");
			

		}
		
		
		
		
		
		
		
		
		
		
		
	

}
