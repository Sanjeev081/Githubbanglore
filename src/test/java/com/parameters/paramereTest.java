package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paramereTest {
	WebDriver driver;


	@Test
	@Parameters({"browser","url","emailid"})
	public void yahoologinTest(String browser, String url,String emailid) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Laptop\\\\Downloads\\\\chromedriver_win32\\\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		  driver.findElement(By.id("login-username")).sendKeys(emailid);
		  driver.findElement(By.id("login-signin")).click();
		
		
	}

}
