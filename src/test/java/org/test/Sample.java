package org.test;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	public void beforeClass() {

		System.out.println("Browser Config and Browser launching");
	}

	@AfterClass
	public void afterClass() {
  
		System.out.println("Quit Browser / Close the Browser");
	}
	
	@BeforeMethod
	public void beforeEachMethod() {

		Date d = new Date();
		
		System.out.println("Start Time"+ d);
	
	
	}
	
	@AfterMethod
	public void afterEachMethod() {

		Date d = new Date();
		System.out.println("End Time"+d);
		
	}
	
	@Test
	public void tc1() {
		
		System.out.println("TC1...");
	}
}
