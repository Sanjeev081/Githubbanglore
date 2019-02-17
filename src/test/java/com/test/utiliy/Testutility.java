package com.test.utiliy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.xcel.utility.Xls_Reader;

public class Testutility {
	static WebDriver driver;
	static Xls_Reader 	 reader;

	public static ArrayList<Object[]> getDatafromExcel( ) {
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			reader=new Xls_Reader("C:\\Users\\Laptop\\eclipse-workspace\\Practice\\src\\test\\java\\com\\testdata\\datadriven.xlsx");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int rowNum=2; rowNum<=reader.getRowCount("regtestdata");rowNum++){
			
				String Firstname=reader.getCellData("regtestdata", "Firstname", rowNum);
				String Lastname=reader.getCellData("regtestdata", "Lastname",rowNum );
				String Adress1=reader.getCellData("regtestdata","Adress1", rowNum);
				String Adress2=reader.getCellData("regtestdata", "Adress2",rowNum );
				String City=reader.getCellData("regtestdata", "City", rowNum);
				String State=reader.getCellData("regtestdata", "regtestdata",rowNum );
				String Zip=reader.getCellData("regtestdata", "Zip",rowNum );
				String emailadress=reader.getCellData("regtestdata", "emailadress",rowNum );
				Object ob[]= {Firstname,Lastname,Adress1,Adress2,City,State,Zip,rowNum};
				
				
				
			}
		
		return myData;
		
		
		
		
	}

	public static boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }
        catch(org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
}
