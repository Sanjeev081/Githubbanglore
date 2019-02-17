package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=2943&ru=");
		//handle drop box
		Select sel=new Select(driver.findElement(By.id("state")));
		sel.selectByValue("CA");
		Select sel1=new Select(driver.findElement(By.id("SECRET_QUESTION")));
		sel1.selectByValue("5");
		Select sel2=new Select(driver.findElement(By.id("birthdate2")));
		sel2.selectByValue("5");
		Select sel3=new Select(driver.findElement(By.id("birthdate1")));
		sel3.selectByValue("12");
		Select sel4=new Select(driver.findElement(By.id("birthdate3")));
		sel4.selectByValue("1992");
		driver.findElement(By.id("acceptq1")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).click();
		
		

	}

}
