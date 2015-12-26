package com.automation.framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.framework.ExcelReader;
import com.automation.framework.DriverFactory.browserType;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class BaseTest extends ExcelReader {

	WebDriver driver;
	protected LoginPage loginPage;
	protected HomePage homePage;
	ExcelReader reader;
	
	@BeforeTest
	public void init(){

		loginPage = new LoginPage(driver);
		reader=new ExcelReader();
	}

	@BeforeSuite
	public void setup() {

		driver=DriverFactory.getWebDriver(browserType.Chrome);
		driver.navigate().to("http://gmail.com");

	}
	@AfterSuite
	public void tearDown(){
		
		//driver.quit();
	}




}
