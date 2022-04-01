package com.Assert_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPgm {
	
	
	@Test
	private void browS() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String actual = driver.getTitle();
		System.out.println(actual);
		
		String Expected = "Online Shopping Site India";
	
		
	//Hard assert
		
	//	Assert.assertEquals(actual, Expected);
		
		//When the assertion fails it will terminate the execution
		
		
	//Soft assert
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(actual, Expected);
		//s.assertAll();
		
		//when the assertion fails it will the execute the program
		
		
		

	}

}
