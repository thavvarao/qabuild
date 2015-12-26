package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver)
	{

		this.driver=driver;
	}

	public HomePage sendMail(String subject,String body,String to) throws InterruptedException{

		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.name("to")).sendKeys(to);
		driver.findElement(By.name("subjectbox")).sendKeys(subject);
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys(body);	
		driver.findElement(By.xpath("//div[text()='Send']")).click();	
		Thread.sleep(20000);
		return new HomePage(driver);

	}

	public LoginPage logOut(){
		driver.findElement(By.xpath("//a[contains(@title,'Google Account')]/span")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.findElement(By.id("Email"));
		return new LoginPage(driver);
	}

}
