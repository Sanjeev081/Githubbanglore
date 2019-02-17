package com.datadraventesting;

import com.xcel.utility.Xls_Reader;

public class Exceloperations {

	

	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Laptop\\eclipse-workspace\\Practice\\src\\test\\java\\com\\testdata\\datadriven.xlsx");


		if(reader.isSheetExist("Homepage")) {
			reader.addSheet("Homepage");
			
		}
		int colcount=reader.getColumnCount("RegTestData");
		System.out.println("Total cols present in Reftestdata sheet:====="+ colcount);
		System.out.println(reader.getCellRowNum("RegTestData   ","firstname", "Tom"));
	}

}
