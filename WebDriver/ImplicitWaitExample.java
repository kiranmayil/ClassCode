package com.wbl.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWaitExample {

	WebDriver driver;

	@Test
	public void walmartSearchDropdownExample() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.walmart.com/");
		System.out.println("Ttile on th ehome page : " + driver.getTitle());

		//Implicitwait syntax
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("global-search-input")).sendKeys("wat");

		List<WebElement> ddValues = driver.findElements(By.cssSelector(".typeahead-row-link"));

		System.out.println("Size of the dropdown : " + ddValues.size());

		for(WebElement element : ddValues){
			System.out.println("Text on the dropdown values : " + element.getText());
			if(element.getText().equals("watches")){
				element.click();
				break;
			}
		}

		String urlOnSerachPage = driver.getCurrentUrl();
		System.out.println("URL on the search page : " + urlOnSerachPage);


		Assert.assertEquals(urlOnSerachPage, "https://www.walmart.com/search/?query=watches&typeahead=wat");

		//driver.findElement(By.className("header-GlobalSearch-submit btn")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
