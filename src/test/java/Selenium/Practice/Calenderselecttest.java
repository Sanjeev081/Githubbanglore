	 package Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenderselecttest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("AMARNATH");
		driver.findElement(By.name("password")).sendKeys("Amarnath@123");
		WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		jse.executeScript("arguments[0].click();", element);
		driver.switchTo().frame("mainpanel");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[2]/a")).click();
		String date="31-september-2017";
		String dateArra[]=date.split("-");//{12,september,2018}
		String day=dateArra[0];
		String month=dateArra[1];
		String yesr=dateArra[2];
		Select sel=new Select(driver.findElement(By.name("slctMonth")));
		sel.selectByValue("9");
       	Select sel1=new Select(driver.findElement(By.name("slctYear")));
		sel1.selectByValue("2017");
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		String beforexpath="//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath="]/td[";
		final int totalweekdays=7;
		boolean flag=false;
		for(int rowNum=2; rowNum<=7; rowNum++) {
			for(int colNum=1; colNum<=totalweekdays; colNum++) {
				String dayval=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
				System.out.println(dayval);
				if(dayval.equals(day)) {
					driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).click();
					flag=true;
					break;	
				}
			}
			if(flag) {
				
			}
		}
			
		}
		
	
	

}
