package Selenium.Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlist {

	public static void main(String args[]) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.braingroom.com/");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("AMARNATH");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Amarnath@123");
//		WebElement element=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
//		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();", element);
//		
//		driver.switchTo().frame("mainpanel");
		
		List<WebElement> tagName = driver.findElements(By.tagName("a"));
		tagName.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLiks = new ArrayList<WebElement>();
		
		System.out.println("Size of all links which are activae and deactive " + tagName.size());
		
		for(int i = 0; i<tagName.size(); i++) {
			System.out.println(tagName.get(i).getAttribute("href"));
			if(tagName.get(i).getAttribute("href") != null && (!tagName.get(i).getAttribute("href").contains("javascript"))){
				activeLiks.add(tagName.get(i));
			}
		}
		System.out.println(activeLiks.size()); 
		
		for(int k=0; k<activeLiks.size(); k++) {
			HttpURLConnection connection =(HttpURLConnection) new URL(activeLiks.get(k).getAttribute("href")).openConnection();
			connection.connect();
			String responce = connection.getResponseMessage(); 
			connection.disconnect();
			System.out.println(activeLiks.get(k).getAttribute("href") + "-----> " + responce);
		}
		
		

	}
}
