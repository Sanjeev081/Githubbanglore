package Selenium.Practice;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
		driver.get("https://www.ebay.com/");//enter url
		driver.manage().window().maximize();//maximixe window
		driver.manage().deleteAllCookies();//delete all the cookies
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("java");
		//driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0; i<linklist.size();i++) {
			String linkText=linklist.get(i).getText();
			System.out.println(linkText);
			
		}
	}

}
