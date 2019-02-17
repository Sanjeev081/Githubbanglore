package Selenium.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readpropertyfile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Laptop\\eclipse-workspace\\Practice\\src\\test\\java\\Selenium\\Practice\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("url");
		System.out.println(url);
		String browserName=prop.getProperty("browser");
        System.out.println(browserName);
        if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
        }else if(browserName.equals("FF")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Laptop\\\\Downloads\\\\chromedriver_win32\\\\geckodriver.exe");
        	driver=new FirefoxDriver();
        }else if(browserName.equals("IE")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Laptop\\\\Downloads\\\\chromedriver_win32\\\\internetexplorerdriver.exe");
        	driver=new InternetExplorerDriver();
        }
        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("first_xpath"))).sendKeys(prop.getProperty("firstname"));
        driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
        driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));

		
		
	
		

	}

}
