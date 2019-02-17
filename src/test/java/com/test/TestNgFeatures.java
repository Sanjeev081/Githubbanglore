package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void logintest() {
		int i=9/0;
		System.out.println("login test");
	}
	@Test(dependsOnMethods="logintest")
	public void homepagetest() {
		System.out.println("home page test");
	}
	@Test(dependsOnMethods="logintest")
	public void searchpagetest() {
		System.out.println("searchpagetest test");
	}
	@Test(dependsOnMethods="logintest")
	public void Registrationpage() {
		System.out.println("reg test");
	


	}
}






