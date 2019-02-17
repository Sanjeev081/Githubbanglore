package Selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	 	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
			System.out.println(driver.getCurrentUrl());
			
		
		
	}

}
