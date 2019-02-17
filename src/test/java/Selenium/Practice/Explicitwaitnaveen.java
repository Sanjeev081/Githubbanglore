package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwaitnaveen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver  driver= new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		 boolean status=element.isdisplayed();
		



	}

}
