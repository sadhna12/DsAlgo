package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class LoginPage //extends DriverFactory

{
	//DriverFactory df;
	private WebDriver driver;//
	
	@FindBy(xpath = "//*[@name=\"username\"]")
	WebElement username;
	@FindBy(id = "id_password")
	WebElement password;

	@FindBy(xpath = "//form/input[4]")
	WebElement signInButton;
	@FindBy(xpath = "//*[@class=\"navbar-brand\"]")
	WebElement title;

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String getLoginPageTitle() {

		return driver.getTitle();
	}
	
	public String getLoginPageURL() {

		return driver.getCurrentUrl();
	}
	
	public void enterUserName(String name) {
		// username.sendKeys(username);
		username.sendKeys(name);
		

	}

	public void enterPassword(String pswd) {
		password.sendKeys(pswd);

	}

	public void clickLoginBtn() {
		signInButton.click();

	}
	
	public HomePage doLogin(String name,String pswd) throws InterruptedException
	{	
		Thread.sleep(1000);
		username.clear();
		username.sendKeys(name);
		password.clear();
		password.sendKeys(pswd);
		
		signInButton.click();
		Thread.sleep(5000);
		return new HomePage(driver);
	}

}