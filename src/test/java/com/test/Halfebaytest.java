package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utiliy.Testutility;

public class Halfebaytest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=29438ru=");
		
	}
	
	@DataProvider
	public Iterator<Object[]>getTestData(){
		
	
		ArrayList<Object[]>Testdata=Testutility.getDatafromExcel();
		return Testdata.iterator();
		
	}
	
	
	@Test(dataProvider="getTestData ",priority=1)
	public void halfebayregpagetest(String firstname,String lastname,String adress1,String adress2,String city,String state,String Zipcode,String emailadress) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=29438ru=");
	    driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("firstname");
	    driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("lastname");
	    driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("adress1");
	    driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("adress2");
	    driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("city");
	    Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
	    sel.selectByValue("CA");
	    driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("804427");
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sanjeevkumar12345.sk@gmail.com");
	    
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

}
