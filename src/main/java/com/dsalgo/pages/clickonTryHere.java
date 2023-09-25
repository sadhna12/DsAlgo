package com.dsalgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickonTryHere {

	private WebDriver driver;
	
	private static By ds_TryHere = By.xpath("//*[text()='Try here>>>']");
	private static By commondEditor1 = By.xpath ("//*[@class='CodeMirror cm-s-default']//textarea");
	private static By output = By.id ("output");
	private static By runBtn = By.xpath ("//*[@onclick=\"runit()\"]");


	public clickonTryHere(WebDriver driver) {
		this.driver =driver;
		
		}

	
	 public String clickon_TryHere() throws InterruptedException 
	   {
		   Thread .sleep(1000);
		   //Thread.sleep(1000);
		   driver.findElement(ds_TryHere).click();;
		   System.out.println("ds_TryHere");
		  // Thread .sleep(1000);
		   //driver.findElement(commondEditor1).click();
	      driver.findElement(commondEditor1).sendKeys("print(\"Hello\")");
	      //driver.findElement(commondEditor1).click();
	      //WebElement out= driver.findElement(output);
		   System.out.println("run command done");
		   driver.findElement(runBtn).click();
		   WebElement out= driver.findElement(output);
		   System.out.println(out.getText());
			return out.getText();
		   }

}
