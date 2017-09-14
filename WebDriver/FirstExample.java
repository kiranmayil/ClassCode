package com.wbl.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstExample {

	WebDriver driver;
	@Test
	public void first() throws InterruptedException{


		//System.setProperty("webdriver.chorme.driver",System.getProperty("user.dir")+"/Resources/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver","C:/Users/Kiranmayi/Programs/JAVA/July-WebDriver/Resources/chromedriver.exe");
		// creating driver object
		driver = new ChromeDriver();

		//URL
		driver.get("http://whiteboxqa.com/");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		//gives the title on the page
		System.out.println("Title :" + driver.getTitle());
		//find the text on the phone symbol
		String phoneText = driver.findElement(By.cssSelector(".phone>a")).getText();

		Assert.assertEquals(phoneText, "925-400-7330");

		System.out.println("text on phone : "+ phoneText);
		System.out.println("Current URL on the page : " + driver.getCurrentUrl());

		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.id("username")).sendKeys("innovapath");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("login")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
