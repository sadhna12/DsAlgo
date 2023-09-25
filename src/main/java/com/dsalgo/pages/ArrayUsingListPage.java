package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class ArrayUsingListPage {
	WebDriver driver=DriverFactory.getDriver();
	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement TryHere;
	
	@FindBy(xpath = "//*[@onclick=\"runit()\"]")
	WebElement runBtn;
		
	@FindBy(xpath = "//*[text()='Arrays Using List']")
	WebElement arrays_using_list;
	
	//@FindBy(id = ("output"))
	//WebElement output1;
	
	@FindBy (xpath= ("//*[@class=\"CodeMirror-scroll\"]"))
	WebElement commondEditor1;
	
	
	
	//private static By output = By.id ("output");
	
	public ArrayUsingListPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ArrayPage clickon_arrays_using_list() throws InterruptedException {
		Thread.sleep(2000);
		arrays_using_list.click();
		return new ArrayPage(driver);
	}
	public ArrayPage user_clicks_on_try_here_button() 
	{
		//TryHere.click();
		return new ArrayPage(driver);
		
	}
	
	public ArrayPage user_runs_the_code(String code) throws InterruptedException 
	{
		
		//By output = By.id ("output");
		 Thread .sleep(1000);
		//   TryHere.click();;
		  
		
	   commondEditor1.sendKeys(code);
	        System.out.println("run command done");
		  
		  	   return new ArrayPage(driver);
			
		 		 		 		
	}
	
	public ArrayPage user_clicks_on_RunButton() 
	{
		 runBtn.click();
		  return new ArrayPage(driver);
		
	}
	public String getHomePageTitle() {
		return driver.getTitle();
	}
}


