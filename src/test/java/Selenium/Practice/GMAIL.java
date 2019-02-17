package Selenium.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GMAIL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("AMARNATH");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Amarnath@123");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		jse.executeScript("arguments[0].click();", element);

		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("//a[contains(text(),'Contacts')]")).click();
        
		
	
		
		

	
			}
		

}
