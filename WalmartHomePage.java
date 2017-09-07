package com.wbl.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WalmartHomePage {

	@Test
	public void walmartMenu() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.walmart.com/");
		System.out.println("Title : " +driver.getTitle());

		List<WebElement> links = driver.findElements(By.cssSelector("a[class*='header-GlobalSecondaryNav-link-']"));
		System.out.println("Size of links : " +links.size());

		System.out.println("Text on the links....");

		for(WebElement li : links){
			System.out.println(li.getText());
		}

		driver.navigate().to("https://www.walmart.com/account/login?tid=0&returnUrl=%2F");
		
		Thread.sleep(2000);
		String str = driver.findElement(By.linkText("Privacy policy")).getText();
		System.out.println("text on the link : " + str);

		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
