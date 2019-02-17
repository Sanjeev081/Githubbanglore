package Amazon;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amzontest {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/b/?node=2024&ref_=Oct_CateC_2020_0&pf_rd_p=9b24975a-faec-5f54-9dcc-7e231105f039&pf_rd_s=merchandised-search-3&pf_rd_t=101&pf_rd_i=2020&pf_rd_m=ATVPDKIKX0DER&pf_rd_r=QFD0KV2XWYXBN46GV19N&pf_rd_r=QFD0KV2XWYXBN46GV19N&pf_rd_p=9b24975a-faec-5f54-9dcc-7e231105f039");
		
	
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		search.sendKeys("Books");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[1]/div/a/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"merchandised-content\"]/div[3]/div[2]/ul/span[1]/li/span/div/a/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"merchandised-content\"]/div[3]/div[2]/div[2]/ul/li[1]/span/div/a/div[1]/div[1]")).click();
		
		
		
		
		
	}

}
