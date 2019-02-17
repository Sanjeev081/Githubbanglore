package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorconcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=29438=");
		//1.xpath
		//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("sanjeev");
		//driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("kumar");
		//driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("tehta bazar");
		
		//2.id
		//driver.findElement(By.id("firstname")).sendKeys("sanjeev");
		//driver.findElement(By.id("lastname")).sendKeys("Kumar");
		//3.name
		driver.findElement(By.name("firstname")).sendKeys("sanjeev");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		//4. linkText
		driver.findElement(By.linkText("Sign in")).click();
		//5.partiallinktext:not  useful
		//6.cssselector
		driver.findElement(By.cssSelector("#address1")).sendKeys("tehta12");
		//7.class not useful
		driver.findElement(by)
		
		
		
	}

}
