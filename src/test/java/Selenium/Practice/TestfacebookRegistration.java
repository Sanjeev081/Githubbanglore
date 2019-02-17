package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestfacebookRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'u_0_j\']")).sendKeys("SANJEEV");
		driver.findElement(By.xpath("//*[@id=\'u_0_l\']")).sendKeys("KUMAR");
		driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("sanjeevkumar12345.sk@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'u_0_v\']")).sendKeys("8056098364");
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("9931058027");
		driver.findElement(By.xpath("//*[@id=\'u_0_a\']")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_11\']")).click();
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\'day\']")));
		sel1.selectByValue("12");
		Select sel2=new Select(driver.findElement(By.xpath("//*[@id=\'month\']")));
		sel2.selectByValue("5");
		Select sel3=new Select(driver.findElement(By.xpath("//*[@id=\'year\']")));
		sel3.selectByValue("1992");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("sanjeevkumar.25");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("9931058027");
		driver.findElement(By.xpath("//*[@id=\'u_0_3\']")).click();
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.manage().window().maximize();
		

	}

}
