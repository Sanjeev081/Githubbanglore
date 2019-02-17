package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovementconcept {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.spicejet.com/");
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		 Thread.sleep(5000);
		driver.findElement(By.linkText("SpiceLounge")).click();
		 
		 

	}

}
