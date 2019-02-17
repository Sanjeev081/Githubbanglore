package Selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverbasics {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("correct title");
			
			
		}
		else {
			System.out.println("incorrect title");
			System.out.println(driver.getCurrentUrl());
			driver.quit();
			
			
		}
		

		}
	}



