package Selenium.Practice;

import java.awt.dnd.DragSourceEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register");
		//1.is displayed()method:applicable for the all elements
		boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);//true
		//2. isenabled() method:
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//false
		//select i agree checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);//true
		//3. isselected()method:only applicable for checkbox,radiobutton
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);//true
		//de-select the checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);//true
		
	}


}
