package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


	WebDriver driver;

	public LoginPage(WebDriver driver){

		this.driver=driver;
	}


	public HomePage loginToApp(String username,String pwd) throws InterruptedException{
		if(driver.findElement(By.id("Email")).isDisplayed()){
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("next")).click();}
		driver.findElement(By.id("Passwd")).sendKeys(pwd);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		return new HomePage(driver);
	}


}
