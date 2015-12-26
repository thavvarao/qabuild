package com.automation.framework;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.automation.framework.DriverFactory.browserType;

public class TestListener implements IInvokedMethodListener {


	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		
		WebDriver driver = DriverFactory.getWebDriver(browserType.Firefox);
		DriverManager.setWebDriver(driver);
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		// TODO Auto-generated method stub
		
		if(DriverManager.getWebDriver()!=null)
			DriverManager.getWebDriver().quit();
	}

}
