package com.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.google.co.in/?gws_rd=ssl");
		 
		
	}
	@Test(priority=1,groups="Title")
	public void googletitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="logo")
	public void googlelogotest() {
		boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		
	}
	@Test(priority=3,groups="linktext")
	public void gmaillinktest() {
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("test1");
		
	}
	
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("test1");
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
