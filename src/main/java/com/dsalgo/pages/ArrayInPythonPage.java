package com.dsalgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class ArrayInPythonPage {

	WebDriver driver = DriverFactory.getDriver();
	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement TryHere;

	@FindBy(xpath = "//*[@onclick=\"runit()\"]")
	WebElement runBtn;

	@FindBy(xpath = "//*[text()='Arrays in Python']")
	WebElement array_in_python;

	// @FindBy(id = ("output"))
	// WebElement output1;

	@FindBy(xpath = ("//*[@class=\"CodeMirror-scroll\"]"))
	WebElement commondEditor1;

	@FindBy(linkText = ("Practice Questions"))

	WebElement Practice_Questions;

	// private static By output = By.id ("output");

	public ArrayInPythonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayPage clickonArray_inPython() throws InterruptedException {
		Thread.sleep(1000);
		array_in_python.click();
		return new ArrayPage(driver);
	}

	public ArrayPage user_clicks_on_try_here_button() {
		TryHere.click();
		return new ArrayPage(driver);

	}

	public ArrayPage user_runs_the_code(String code) throws InterruptedException {

		// By output = By.id ("output");
		Thread.sleep(3000);
		// TryHere.click();;
		System.out.println("ds_TryHere");

		commondEditor1.sendKeys("print(\"Hello\")");
		System.out.println("run command done");

		return new ArrayPage(driver);

	}

	public ArrayPage user_clicks_on_RunButton() {
		runBtn.click();
		return new ArrayPage(driver);

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public ArrayPage user_clicks_onPracticeQuestion() {
		Practice_Questions.click();
		return new ArrayPage(driver);

	}
}
