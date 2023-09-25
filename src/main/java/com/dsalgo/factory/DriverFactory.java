package com.dsalgo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	// public WebDriver driver;

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		} else if (browser.equals("safari")) {
			//tlDriver.set(new SafariDriver());
			driver = new SafariDriver();

		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/login");
	
		System.out.println("returning driver");
		return driver;
	}}
