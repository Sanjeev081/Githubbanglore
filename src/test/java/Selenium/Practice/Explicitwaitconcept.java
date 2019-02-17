package Selenium.Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwaitconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a")).click();
		Set<String> handler =driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowId=it.next();
		System.out.println("parent window id:"+ parentwindowId);
		String childwindowId=it.next();
		System.out.println("child window id:"+childwindowId);
		

	}

}
