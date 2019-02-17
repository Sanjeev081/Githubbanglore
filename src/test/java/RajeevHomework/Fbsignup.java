package RajeevHomework;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.Practice.Findelementsconsept;



public class Fbsignup {
	
	static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
	}

	@Test(priority = 1)
	public void verifyWithoutEnteringAnyField()  {
		
		
        driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
        
                
	}
	
	@Test(priority=2)
	public void firstNameEnterAndValidData() {
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("DIMMA");
		
	}

	@Test(priority=3)
	public void surNamewithData() {
		 driver.findElement(By.id("u_0_l")).sendKeys("DIM");
	
		
	}
	@Test(priority=4)
	public void mobilenooremailadresswithdata() {
		driver.findElement(By.id("u_0_o")).sendKeys("7777777777");
		
	}
	@Test(priority=5)
	public void newpasswordwithdata() {
		driver.findElement(By.id("u_0_v")).sendKeys("804427");
	}
	@Test(priority=6)
	public void birthdaywithdata() {
		Select sel=new Select(driver.findElement(By.id("day")));
		sel.selectByValue("12");
		
	}
	@Test(priority=7)
	public void birthdaymonthwithdata() {
		Select sel1=new Select(driver.findElement(By.id("month")));
		sel1.selectByValue("5");
	}
	@Test(priority=8)
	public void birthdayyearwithdata() {
		Select sel2=new Select(driver.findElement(By.id("year")));
		sel2.selectByValue("1992");
		
	}
	@Test(priority=9)
	public void checkrediuobuttonwithclick() {
		driver.findElement(By.id("u_0_9")).click();
	}
	@Test
	public void checkandclickwithsignupoption() {
		driver.findElement(By.id("u_0_11")).click();
	}

	
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	}
	

