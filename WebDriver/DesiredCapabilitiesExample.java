package com.wbl.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesiredCapabilitiesExample {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Resources/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//   co.addArguments("");
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("javascriptEnabled", false);
		System.out.println("JavaScript Enabled : " +dc.getCapability("javascriptEnabled"));*/

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("dom.disable_beforeunload", true);

		driver = new ChromeDriver(co);
	}

	@Test
	public void jabong(){
		driver.get("http://www.jabong.com/");
		/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mainElement = driver.findElement(By.linkText("Kids"));
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		WebElement subElement = driver.findElement(By.linkText("Skirts"));
		//action = new Actions(driver);
		action.moveToElement(subElement).click().build().perform();*/
	}

}
