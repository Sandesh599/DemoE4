package com.jbk.Eproc.TestCases;

import org.testng.annotations.Test;

import com.jbk.Eproc.TestBase.TestBase;

public class A extends TestBase {
	@Test
	public void m1(){
		System.out.println(driver.getTitle());
		log.info("AAAAAAAAAAA");
		test1.info("ABCD");
		
	}

}
