package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicefacebookpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'u_0_j\']")).sendKeys("sanjeev");
		driver.findElement(By.xpath("//*[@id=\'u_0_9\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'u_0_11\']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\'day\']")));
		sel.selectByValue("12");
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\'month\']")));
		sel1.selectByVisibleText("May");
		Select sel2=new Select(driver.findElement(By.xpath("//*[@id=\'year\']")));
		sel2.selectByValue("1992");
		
		

		

	}

}
