package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;


public class PageFactory1  {
    public static void main(String[] args) {
        // Create a new instance of a driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the right place
        driver.get("http://www.google.com/");
        System.out.println("Opened the browser");
        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        // And now do the search.
        page.searchFor("Cheese");
    }
} 
