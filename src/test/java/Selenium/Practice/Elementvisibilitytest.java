package Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibilitytest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");
		//1.is displayed() method applicable for all elements
		boolean b1=driver.findElement(By.name("submitButton")).isDisplayed();
		System.out.println(b1);//true
		//2.is enabled() metrhod
		boolean b2=driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println(b2);//false
		//3.select i agreecheckbox
		driver.findElement(By.name("agreeTerms")).click();//submit button is enablenow
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);//true
		//3.is selected() method:only applicable for checkbox,drop down,radiobutton
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);//true
		//deselect the checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);//false
		 
		
		
		

	}

}
