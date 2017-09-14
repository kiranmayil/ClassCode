package com.wbl.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertExample {
	WebDriver driver;

	@BeforeClass
	public void beforeClassMethod(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void alertWindowExample() throws InterruptedException{
		driver.get("file:///C:/Users/Kiranmayi/Programs/JAVA/July-WebDriver/src/com/wbl/main/HtmlAlert");
		driver.findElement(By.id("alertID")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		//alert.sendKeys("Innovapath");
		Thread.sleep(5000);
		alert.dismiss();
		Thread.sleep(3000);
	}

	@Test
	public void alertSimple(){
		driver.get("http://oldnavy.gap.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal--close-icon--svg")));
		//modal--close-icon--svg
		//driver.findElement(By.cssSelector("#closewelcomeRedirectPopupDialog")).click();
		ele.click();
	}

}
