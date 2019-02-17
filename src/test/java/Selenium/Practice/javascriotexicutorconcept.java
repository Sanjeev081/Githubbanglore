package Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.Select;

public class javascriotexicutorconcept {

	private static Object element;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("AMARNATH");
		driver.findElement(By.name("password")).sendKeys("Amarnath@1234");
		Thread.sleep(5000);
        WebElement element=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		jse.executeScript("arguments[0].click();", element);
		WebElement loginBtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		//flash(loginBtn, driver);
		//drawborder( loginBtn, driver);
		//generate Alert
		//generateAlert(driver,"There is an issue with Login button on login page")
		//clickElementByjs(loginBtn, driver);
		//refresh the page :
		//1.by using selenium
		driver.navigate().refresh();
		//2.by using js exicutor
		refreshBrowserByjs(driver);
		//3.Get the title of the page by js:
	    System.out.println(getTitleByjs(driver));
	    //4.get pageinner Text
	    System.out.println(getpageInnerText(driver));
	    //scrollpageDown:
	    //scrollpageDown(driver);
	   //WebElement forgotpwdLink=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")); 
	   //scrollIntoview(forgotpwdLink,driver);
	    
	    javascriotexicutorconcept.scrollpageDown(driver);
		
	
	}
//	public static void flash(WebElement element,WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor) driver);
//		String bgcolor =element.getCssValue("backgroundcolor");
//		for (int i=0; i < 100; i++) {
//			changecolor("rgb(0,200,0)",element,driver);
//		}
//			
//	}
//	 public static void changecolor(String color, WebElement element, WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor) driver);
//		js.executeScript("argument[0].style.backgroundColor='"+color+"'",element);
//		try {
//			
//			Thread.sleep(20);
//		}catch(InterruptedException e) {
//			
//		}
		
		
	//}
//	 public static void drawborder(WebElement element,WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor) driver);
//		js.executeScript("argument[0].style.border='3px solid red'",element);
//		}
	  public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	
		
	}
//	public static  void clickElementByjs(WebElement element,WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor) driver);
//		js.executeScript("argument[0].click();", element);
//		
//	} 
	public static void refreshBrowserByjs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
		
	}
	public static String getTitleByjs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String title =	js.executeScript("return document.title;").toString();
		return title;
		
	
		
	}
	public static String getpageInnerText(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
		
	}
	public static void scrollpageDown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
	public static void scrollIntoview(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("argument[0].scrollIntoview(true);", element);
	
	}
																																				
}
