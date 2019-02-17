package com.datadraventesting;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.xcel.utility.Xls_Reader;

public class datadraventest {

	

	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Laptop\\eclipse-workspace\\Practice\\src\\test\\java\\com\\testdata\\datadriven.xlsx");
		String Firstname=reader.getCellData("Regtestdata", "Firstname",2 );
		System.out.println(Firstname);
		
		String Lastname=reader.getCellData("Regtestdata", "Lastname",2 );
		System.out.println(Lastname);
		
		String Adress1=reader.getCellData("Regtestdata", "Adress1",2 );
		System.out.println(Adress1);
		
		String Adress2=reader.getCellData("Regtestdata", "Adress2",2 );
		System.out.println(Adress2);
		
		String City=reader.getCellData("Regtestdata", "City",2 );
		System.out.println(City);
		
		String State=reader.getCellData("Regtestdata", "State",2 );
		System.out.println(State);
		
		String Zip=reader.getCellData("Regtestdata", "Zip",2 );
		System.out.println(Zip);
		
		String emailadress=reader.getCellData("Regtestdata", "emailadress",2 );
		System.out.println(emailadress);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.all?RegisterEnterInfo&usage=29438ru=");
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(Firstname);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(Lastname);
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(Adress1);
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys(Adress2);
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(City);
		
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
		
		sel.selectByVisibleText(State);
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys(Zip);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailadress);
		
			}

}
