package Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicwebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("AMARNATH");
		driver.findElement(By.name("password")).sendKeys("Amarnath@123");
		WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		jse.executeScript("arguments[0].click();", element);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[3]/td[1]/input")).click();
		
		////*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		String name=driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[4]/td[2]/a")).getText();
		System.out.println(name);

		
		
		
	

	}

}
