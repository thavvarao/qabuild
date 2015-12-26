package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class GoogleSearchPage  {
	
	 private WebElement q;
	 
	    public void searchFor(String text) {
	        // And here we use it. Note that it looks like we've
	        // not properly instantiated it yet....
	        q.sendKeys(text);
	        q.submit();
	        WebDriver drriver = null;
			ElementLocatorFactory e = new AjaxElementLocatorFactory(drriver, 30);
	    }
	    
	    

}

