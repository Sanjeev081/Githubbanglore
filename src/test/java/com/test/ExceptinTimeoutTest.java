package com.test;

import org.testng.annotations.Test;

public class ExceptinTimeoutTest {
	/**@Test
	public void infinitelooptest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}**/
	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		String x="100A";
		Integer.parseInt(x);
	}

}


