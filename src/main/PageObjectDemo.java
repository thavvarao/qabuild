package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.framework.BaseTest;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class PageObjectDemo extends BaseTest{


  @Test
  public void loginAndSendMail() throws InterruptedException {
	  
	  homePage = loginPage.loginToApp("thavva.hadoop@gmail.com", "interOP@123");
	  homePage.sendMail("Test", "Testing Page object demo", "thavva.hadoop@gmail.com");
	  homePage.logOut();
  }
  
  @Test
  public void loginAndSendMailUsingExcel() throws Exception {
	  
	  setSheetName("Sheet1");
	  
	  setTestDataId("TC1");
	  
	  homePage = loginPage.loginToApp(getTestDataFromExcel("UserName"), getTestDataFromExcel("Password"));
	  homePage.sendMail("Test", "Testing Page object demo", "thavva.hadoop@gmail.com");
	  homePage.logOut();
	  WebDriver driver = new FirefoxDriver();
	  Selenium sel  = new WebDriverBackedSelenium(driver, driver.getCurrentUrl());
	 
	  
	  
  }
  
  @Parameters({ "username", "password"})
  @Test
  public void loginAndSendMailUsingXml(String UserName,String password) throws Exception {
	  
	  homePage = loginPage.loginToApp( UserName, password);
	  homePage.sendMail("Test", "Testing Page object demo", "thavva.hadoop@gmail.com");
	  homePage.logOut();
  }
}
