package Selenium.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowid=it.next();
		System.out.println("parent window id:"+parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("child window id:"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		
		System.out.println("child window pop title"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		System.out.println("parent window pop title"+driver.getTitle());



	}

}
