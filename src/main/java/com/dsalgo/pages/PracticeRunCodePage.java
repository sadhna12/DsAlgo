package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class PracticeRunCodePage 
{
	
	
WebDriver driver=DriverFactory.getDriver();
	
	@FindBy(linkText=("Search the array"))
	WebElement Searc_the_array;
	
	@FindBy(linkText=("Max Consecutive Ones"))
	WebElement Max_Consecutive_Ones;
	

	@FindBy(linkText=("Find Numbers with Even Number of Digits"))
	WebElement Find_Numbe_with_Even_Number;
	
	@FindBy(xpath=("//*[text()=\"Squares of  a Sorted Array\"]"))
	WebElement Squares_of_Sorted_Array;
	
	PracticeRunCodePage(WebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
	}
	
	
	public PracticeQuestions searcharray()
	{
		Searc_the_array.click();
		return new PracticeQuestions(driver);
	}
//	
//	public PracticeQuestions max_Consecutive_Ones()
//	{
//		Max_Consecutive_Ones.click();
//		return new PracticeQuestions(driver);
//	}
//	
//	
//	   public PracticeQuestions find_Numbe_with_Even_Number()  { 
//		   
//	  Find_Numbe_with_Even_Number.click();  
//	  return new PracticeQuestions(driver);
//	   }
//	  
//	   public PracticeQuestions squares_of_Sorted_Array() // { //
//	  Squares_of_Sorted_Array.click(); // return new PracticeQuestions(driver); //
//	  }
	 
}
