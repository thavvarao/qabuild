package com.automation.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	static WebDriver driver;

	enum browserType{

		Firefox,Chrome,IE
	}


	public static WebDriver getWebDriver(browserType type){


		switch(type){

		case Firefox:
			ProfilesIni allProfiles = new ProfilesIni();
			FirefoxProfile profile = allProfiles.getProfile("default");
			profile.setPreference("dom.max_chrome_script_run_time", 0);
			profile.setPreference("dom.max_script_run_time", 0);
			driver = new FirefoxDriver(profile);

			break;

		case Chrome:
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			
			
			break;

		case IE:
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new InternetExplorerDriver();
			break;

		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;

	}



}
