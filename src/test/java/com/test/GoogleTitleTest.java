package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	}
	@Test()
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title is not matched");
	}
	@Test()
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
