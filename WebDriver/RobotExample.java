package com.wbl.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RobotExample {
	WebDriver driver;

	@BeforeClass
	public void beforeClassMethod(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void robotExample() throws AWTException{
		driver.get("https://www.walmart.com/");
		driver.findElement(By.id("global-search-input")).sendKeys("Watches");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
		action.keyUp(Keys.ENTER).perform();*/
	}

	@Test
	public void fileUploadWithRobot() throws AWTException, InterruptedException{
		driver.get("https://my.indeed.com/resume?from=hp2&subfrom=rezprmstd&trk.origin=homepage&trk.variant=rezprmstd&trk.tk=1bpunvbfk1e7j7ju&co=US&hl=en_US");
		driver.findElement(By.cssSelector(".splash-upload>label")).click();
		//C:\Users\Kiranmayi\Desktop\loggers.txt

		Thread.sleep(3000);
		StringSelection selectPath = new StringSelection("file:///C:\\Users\\Kiranmayi\\Desktop\\QA Class Schedule (Sept 11th to Sep 15th)-2017.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectPath, null);

		System.out.println(selectPath);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test
	public void fileUploadWithAutoIT() throws IOException{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://my.indeed.com/resume?from=hp2&subfrom=rezprmstd&trk.origin=homepage&trk.variant=rezprmstd&trk.tk=1bpunvbfk1e7j7ju&co=US&hl=en_US");
		driver.findElement(By.cssSelector(".splash-upload>label")).click();

		Runtime.getRuntime().exec("C:\\Users\\Kiranmayi\\Desktop/MayautoIT");

		String textOnPage = driver.findElement(By.cssSelector(".control-label>span")).getText();
		System.out.println("text on the page :" + textOnPage);
		Assert.assertEquals(textOnPage, "Email Address");
	}

}
