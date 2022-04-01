package com.SampleProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SimpleProject {

	public static WebDriver driver;

	@Test(priority = 0)
	public void ApplicationLanuch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("Application Launched successfully.");

	}

	@Test(priority = 1)
	public void summerDress() {

		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Dresses).build().perform();
		Actions summerdresses = ac.moveToElement(driver.findElement(By.partialLinkText("SUMMER")));
		summerdresses.click().perform();

	}

	@Test(priority = 2)
	public void productChecking() {

		JavascriptExecutor sc = (JavascriptExecutor) driver;
		sc.executeScript("window.scrollBy(0,200)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//div[@class='product-container'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		sc.executeScript("window.scrollBy(0,250)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();

		WebElement element = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select dropdown = new Select(element);
		dropdown.selectByValue("2");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@name='Blue']")).click();

	}

	@Test(priority = 3)
	public void addtoCart() throws InterruptedException {

		WebElement addtocar = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		addtocar.click();
		System.out.println("Product added to cart successfully.");

	}

	@Test(priority = 4)
	public void CheckOut() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

	}

	@Test(priority = 5)
	public void SiginIn() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement summary = driver.findElement(By.partialLinkText("checkout"));
		summary.click();
		System.out.println("Customer verifed summary details");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		js.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajua12695@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Raju@621712");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

	}

	@Test(priority = 6)
	public void addressShipping() {

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement address = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		address.click();
		System.out.println("Customer verifyed the address details");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		js1.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

	@Test(priority = 7)
	public void paymentscreenShot() throws IOException {

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Chandru\\eclipse-workspace\\TestNg\\Screenshot\\test.png");
		FileUtils.copyFile(source, dest);

	}

	@Test(priority = 8)
	public void backtoLoginpage() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@class='home']")).click();
		System.out.println("Customer back to homepage");

	}

}
