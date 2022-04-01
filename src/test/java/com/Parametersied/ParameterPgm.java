package com.Parametersied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPgm {
	
	@Parameters({"email", "pass"})
	@Test
	private void loGin(String email, String pass) {
		System.out.println(email + " "+ pass);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		

	}
	

}
