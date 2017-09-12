package com.wbl.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

public class FluentWaitExample {

	WebDriver driver;

	@Test
	public void yelpDropDownExample() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiranmayi\\Programs\\JAVA\\July-WebDriver\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yelp.com/san-jose");

		Thread.sleep(5000);
		driver.findElement(By.id("find_desc")).sendKeys("pizz");
		Thread.sleep(5000);

		//List<WebElement> ddList = driver.findElements(By.xpath(".//*[@class='suggestions-list']/li"));

		/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.pollingEvery(2, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);

		//List<WebElement> ddList =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".suggestion-detail.suggestion-title.suggestion-name")));

		System.out.println("Number of suggestions on the list : " + ddList.size());

		for(WebElement list : ddList){
			System.out.println("name on the list : " + list.getText());
			if(list.getText().equals("Food")){
				list.click();
				break;
			}
		}*/

		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.until(predicate);

		Thread.sleep(3000);
		driver.close();
	}

	Predicate<WebDriver> predicate = new Predicate<WebDriver>(){

		@Override
		public boolean apply(WebDriver arg0) {

			List<WebElement> ddList = driver.findElements(By.xpath(".//*[@class='suggestions-list']/li"));
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(2, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);

			//List<WebElement> ddList =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".suggestion-detail.suggestion-title.suggestion-name")));

			System.out.println("Number of suggestions on the list : " + ddList.size());

			for(WebElement list : ddList){
				System.out.println("name on the list : " + list.getText());
				if(list.getText().equals("Food")){
					list.click();
					break;
				}
			}
			if(ddList.size()==7){
				return true;
			}else
			return false;
		}


	};

}
