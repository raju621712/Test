package com.Dependcy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependncyPgm {
	
	public static WebDriver driver;
	
	@Test(dependsOnMethods = "openBrowser")
	public void signIn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		System.out.println("Sing in completed");

	}

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("URL Setup process is completed");
		
	}
	
	@Test(dependsOnMethods = "signIn")
	
	public void logOut() {
		System.out.println("The user logget out successfully");
		

	}
	
}
