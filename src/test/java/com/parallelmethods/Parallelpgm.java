package com.parallelmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelpgm {
	
	@Test
	private void amaZon() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	@Test
	private void fliPkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		

	}
}
