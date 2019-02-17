package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	/**[RemoteTestNG] detected TestNG version 6.14.2
setup system property for chrome
enetr url
Launch the browser	
login to app
Google title test
Log out from app
close Bbrowser
dele all cookies**/

	//pre-conditions annotatation--starting with before
	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
		
	}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("Launch the browser	");
		
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterurl() {
		System.out.println("enetr url");
	}
	//test cases--starting with Test
	@Test
	public void Googletitletest() {
		System.out.println("Google title test");
	}
	@Test
	public void searchtest() {
		System.out.println("search test");
	}
		
	//post conditions--starting with @After
	@AfterMethod
	public void logout() {
		System.out.println("Log out from app");
	}
	@AfterTest
	public void deleteAllcookies() {
		System.out.println("dele all cookies");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("close Bbrowser");
	}


	}

	
	

