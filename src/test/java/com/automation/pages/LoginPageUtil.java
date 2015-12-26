package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageUtil {
	
	WebDriver driver=null;
	public LoginPageUtil(WebDriver driver){
		this.driver = driver;
		
	}
	
	private  <T> T login(String user, String pw, Class<T> expectedPage){
		
		WebElement username =driver.findElement(By.id("Email"));
		WebElement password =driver.findElement(By.id("Passwd"));
		WebElement submitButton =driver.findElement(By.id("signIn"));
		
	    username.sendKeys(user);
	    password.sendKeys(pw);
	    submitButton.click();
	    return PageFactory.initElements(driver, expectedPage);
	  
	}
	
	
	public HomePage loginAsAdmin(String user, String pw){
	    return login(user, pw, HomePage.class);
	}

	public ComposePage loginAsCustomer(String user, String pw){
	    return login(user, pw, ComposePage.class);
	}

	public LoginPageUtil loginWithBadCredentials(String user, String pw){
	    return login(user, pw, LoginPageUtil.class);
	}

}
