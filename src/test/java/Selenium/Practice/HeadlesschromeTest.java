package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlesschromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size-1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Login page title=="+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("AMARNATH");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Amarnath@123");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		jse.executeScript("arguments[0].click();", element);
		System.out.println("Login page title "+driver.getTitle());

	}

}
