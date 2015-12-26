package com.automation.framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNG {
	
	@Test
	public void t1(){
		System.out.println("Test");
	}
	
	@Test
	public void t2(){
		System.out.println("Test2");
	}
	
	
	@BeforeTest(alwaysRun=true)
	public void bt(){
		System.out.println("before Test");
	}
	

	@BeforeClass
	public void bc(){
		System.out.println("before class");
	}

	
	@BeforeSuite
	public void bs(){
		System.out.println("before suite");
	}


}
