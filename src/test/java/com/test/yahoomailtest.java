package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yahoomailtest {
	@BeforeClass
	public void launchbrowser() {
		System.out.println("launch ff");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}
	@Test(priority=1)
	public void composemail() {
		System.out.println("composemail");
	}
	@Test(priority=2)
	public void deletemailtest() {
		System.out.println("deletemailtest");
	}
	@Test(priority=3,enabled=false)
	public void searchmailtest() {
		System.out.println("searchmailtest");
		
		
	}
	@Test(priority=4)
	public void sentitemmailtest() {
		System.out.println("sentitem mail test");
		
	}
	
	@AfterMethod()
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void quitbrowser() {
		System.out.println("quit browser");
	}
	





}
