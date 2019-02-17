package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Halfregpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=29438ru=");
	    driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("sanjeev");
	    driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("kumar");
	    driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("tehta");
	    driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("jehanabad");
	    driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("patna");
	    Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
	    sel.selectByValue("CA");
	    driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("804427");
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sanjeevkumar12345.sk@gmail.com");
	    
	    
	   
	}

}
