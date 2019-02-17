package Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("java tutorial");
		
		if(search.isDisplayed()) {
			System.out.println(search.isDisplayed());
		} else {
			System.out.println("not ");
		}
		
		List<WebElement>  listOfSearch= driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li/div[1]/div/span"));
		
		System.out.println(listOfSearch.size());
		
		for(int i=0; i<listOfSearch.size(); i++) {
			if(listOfSearch.get(i).getText().contains("java tutorial for selenium")) {
				listOfSearch.get(i).click();
				break;
			}
			
			
		}
		
}

}
