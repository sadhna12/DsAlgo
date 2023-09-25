package com.dsalgo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class PracticeQuestions {
	
	
	WebDriver driver=DriverFactory.getDriver();
	

	
	@FindBy(linkText=("Search the array"))
	WebElement Searc_the_array;
	
	@FindBy(linkText=("Max Consecutive Ones"))
	WebElement Max_Consecutive_Ones;
	
	@FindBy(linkText=("Find Numbers with Even Number of Digits"))
	WebElement Find_Numbe_with_Even_Number;
	
	@FindBy(xpath=("//*[text()=\"Squares of  a Sorted Array\"]"))
	WebElement Squares_of_Sorted_Array;
	
	@FindBy(xpath=("//*[@class=\"CodeMirror-scroll\"]"))
	WebElement codeEditor;
	
	@FindBy(xpath=("//*[@onclick=\"runit()\"]"))
	WebElement RunBtn;
	
	@FindBy(xpath=("//*[@value='Submit']"))
	WebElement submit;
	

	
	public PracticeQuestions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public PracticeRunCodePage searchTheArray() {

	//	practiceRunCodePage.searcharray();
		
		System.out.println("titlename is" + driver.getTitle());
//		driver.navigate().back();
		
		return new PracticeRunCodePage(driver);

	}
	public PracticeQuestions nax_Consecutive_Ones() {

		Max_Consecutive_Ones.click();
		
		///System.out.println("titlename is" + driver.getTitle());
		
		return new PracticeQuestions(driver);

	}
//	public ArrayInPythonPage find_Numbe_with_Even_Number() {
//
//		Find_Numbe_with_Even_Number.click();
//		
//		System.out.println("titlename is" + driver.getTitle());
//		
//		return new ArrayInPythonPage(driver);
//
//	} 
//	public ArrayInPythonPage squares_of_Sorted_Array() {
//
//		Squares_of_Sorted_Array.click();
//		
//		System.out.println("titlename is" + driver.getTitle());
//		
//		return new ArrayInPythonPage(driver);
//
//	}
//	
//	public ArrayInPythonPage writeCode() {
////		codeEditor.sendKeys("print(\"Hello\")");
////		//codeEditor.clear();
////
////		codeEditor.sendKeys("print(\"# Initializing list\r\n"
////				+ "test_list = [12, 23, 45, 67, 6, 90]\r\n"
////				+ "\r\n"
////				+ "# Checking if 4 exists in list\r\n"
////				+ "for i in test_list:\r\n"
////				+ "	if(i == 12):\r\n"
////				+ "		print(\"Element Exists\")\")");
//		return new ArrayInPythonPage(driver);
//	}
//	
//public ArrayInPythonPage runCode() {
//
//	//RunBtn.click();
//	
////	try{
////	} catch (Exception e) {
////	if(e.toString().contains("org.openqa.selenium.UnhandledAlertException"))
////	 {
////	    Alert alert = driver.switchTo().alert();
////	    alert.accept();
////	 }
////	}
//		return new ArrayInPythonPage(driver);
//	}
//public ArrayInPythonPage submitCode() {
//
//	//submit.click();
//	return new ArrayInPythonPage(driver);
//}
//	
//	
	public String getHomePageTitle() {
		return driver.getTitle();
	}}
//}
