package com.dsalgo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class MaxConsecutiveOnesPage 

{

	
		WebDriver driver=DriverFactory.getDriver();
		

		
		@FindBy(linkText=("Max Consecutive Ones"))
		WebElement Max_Consecutive_Ones;
		
		@FindBy(xpath=("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"))
		WebElement codeEditor;
		
		@FindBy(xpath=("//*[@onclick=\"runit()\"]"))
		WebElement RunBtn;
		
		@FindBy(xpath=("//*[@value='Submit']"))
		WebElement submit;
		
		public MaxConsecutiveOnesPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public ArrayInPythonPage click_MaxConsecutiveOnes() {

			Max_Consecutive_Ones.click();
				
				System.out.println("titlename is" + driver.getTitle());
//				driver.navigate().back();
				
				return new ArrayInPythonPage(driver);

			}
		public ArrayInPythonPage writeTheCode() {

			codeEditor.sendKeys("print(\"# Initializing list\r\n"
					+ "test_list = [12, 23, 45, 67, 6, 90]\r\n"
					+ "\r\n"
					+ "# Checking if 4 exists in list\r\n"
					+ "for i in test_list:\r\n"
					+ "	if(i == 12):\r\n"
					+ "		print(\"Element Exists\")\")");
				
				return new ArrayInPythonPage(driver);

			}
		
		public ArrayInPythonPage runCode() {
		
			
			
			try{
				Thread.sleep(2000);
				//RunBtn.click();
			} catch (Exception e) 
			{
		if(e.toString().contains("org.openqa.selenium.UnhandledAlertException"))
			 {
			    Alert alert = driver.switchTo().alert();
			    alert.accept();
		 }
			}
				return new ArrayInPythonPage(driver);
			}
		public ArrayInPythonPage submitCode() {
		
			submit.click();
			return new ArrayInPythonPage(driver);
		}
		
		
		public String getHomePageTitle() {
			return driver.getTitle();
		}
		
	}


