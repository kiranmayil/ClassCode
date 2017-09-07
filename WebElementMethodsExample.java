package com.wbl.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElementMethodsExample {

	WebDriver driver;

	@Test
	public void facebookExample() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.name("firstname"));
		userName.sendKeys("Test123");

		System.out.println("Displayed : " + userName.isDisplayed());
		System.out.println("Enabled : " + userName.isEnabled());
		System.out.println("selected : " + userName.isSelected());

		//driver.findElement(By.id("u_0_9")).sendKeys("Test123");

		driver.findElement(By.name("lastname")).sendKeys("456");

		List<WebElement> monthDropdown = driver.findElements(By.id("month"));
		System.out.println("Number of Months : " + monthDropdown.size());

		//System.out.println("Number of Months : " + monthDropdown.get(1));

		for(WebElement str : monthDropdown){
			System.out.println("list of Months on the drop down : " + str.getText());
		}

		//Select select = new Select(monthDropdown);
		//select.selectByVisibleText("Apr");*/

		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByIndex(6);
		//select.deselectByIndex(6);

		select = new Select(driver.findElement(By.id("year")));
		select.selectByValue("2000");

		driver.findElement(By.id("u_0_6")).click();

		Thread.sleep(5000);
		driver.close();

	}
}
