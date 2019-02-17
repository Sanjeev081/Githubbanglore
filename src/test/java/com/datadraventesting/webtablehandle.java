package com.datadraventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandle {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
			String beforexpath_company	="//*[@id=\"customers\"]/tbody/tr[";
			String afterxpath_company	 ="]/td[1]";
			
			String beforexpath_Contact="//*[@id=\"customers\"]/tbody/tr[";
			String afterxpath_Contact="]/td[2]";
			
			String beforexpath_Country="//*[@id=\"customers\"]/tbody/tr[";
			String afterxpath_Country="]/td[3]";
			for(int i=2;i<=7;i++) {
				String actualxpathcompany=beforexpath_company+i+afterxpath_company;
				String companyname=driver.findElement(By.xpath(actualxpathcompany)).getText();
				System.out.println(companyname);
				
				String actualxpathcontact=beforexpath_Contact+i+afterxpath_Contact;
				String  Contactname=driver.findElement(By.xpath(actualxpathcontact)).getText();
				System.out.println(Contactname);
				
				String actualxpathCountry=beforexpath_Country+i+afterxpath_Country;
				  String Countryname=driver.findElement(By.xpath(actualxpathCountry)).getText();
				  System.out.println(Countryname);
				
				
			}
		

	}

}
