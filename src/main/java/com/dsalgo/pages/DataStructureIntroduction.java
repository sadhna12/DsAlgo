package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class DataStructureIntroduction 
{
	private WebDriver driver;
	
	@FindBy(xpath  = "//a[contains(@href,'data-structures-introduction')]")
	WebElement GetStartedBtns;
	
	@FindBy(xpath  = "//*[text()='Time Complexity']")
	WebElement time_complexity;
	
	@FindBy(xpath  = "//*[text()='Practice Questions']")
	WebElement practice_que;
	
	public DataStructureIntroduction( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGetStarted() throws InterruptedException
	{
		Thread.sleep(3000);
		GetStartedBtns.click();
	}
	
	public void clickOn_TimeComplexity()
	{
		time_complexity.click();
	}
	public void clickOnPractice()
	{
		practice_que.click();
	}
	public String getTitlePage() {

		return driver.getTitle();
	}
	
}
