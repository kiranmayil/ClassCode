package com.wbl.main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsExample {

	WebDriver driver;

	@Test
	public void walmartSearchDropdownExample() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		WebElement mainElement = driver.findElement(By.xpath(".//*[@id='s0-container']/li[5]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();



		//Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement subElement = wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath(".//*[@id='s0-container']/li[5]/div[2]/div[1]/div[2]/ul/li[2]/a")));

		//driver.findElement(By.xpath(".//*[@id='s0-container']/li[5]/div[2]/div[1]/div[2]/ul/li[2]/a")).click();

		subElement.click();

		//https://www.ebay.com/rpp/watches

		System.out.println("Tittle on Subpage : " + driver.getCurrentUrl());

	}
}
