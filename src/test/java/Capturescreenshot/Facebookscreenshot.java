package Capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
@Test
public class Facebookscreenshot {
	public void Capturescreenshot() throws IOException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Test automation");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./Screenshot/ebay.png.png"));
		
		
		driver.quit();	
	}

}
