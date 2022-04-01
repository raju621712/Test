package com.SampleProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {
	
	public static WebDriver driver;
	
	@Test
	public void searcHbar() throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dress");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='selectProductSort']")).click();
		Robot rc= new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
