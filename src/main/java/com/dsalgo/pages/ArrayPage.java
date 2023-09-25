package com.dsalgo.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage {

	private WebDriver driver;

	// @FindBy(xpath = "//*[@class=\"list-group-item\"]")
	// WebElement GetStartedBtns;

	@FindBy(xpath = "//*[text()='Arrays in Python']")
	WebElement array_in_python;
	
	

	@FindBy(xpath = "//*[text()='Arrays using list']")
	WebElement arrays_using_list;

	@FindBy(xpath = "//*[text()='Basic Operations in Lists']")
	WebElement basic_Operations_in_Lists;

	@FindBy(xpath = "//*[text()='Applications of Array']")
	WebElement applications_of_array;

	@FindBy(linkText = "Get Started")
	WebElement GetStartedBtns;

	@FindBy(xpath = "//*[text()='Time Complexity']")
	WebElement time_complexity;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practice_que;

	// @FindBy(xpath = "//*[@class=\"list-group-item\"]")
	// WebElement arrayTopics;

	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement TryHere;

	@FindBy(xpath = "//*[@onclick=\"runit()\"]")
	WebElement runBtn;

	private By arrayTopics = (By.tagName("ul"));

	// private By GetStartedBtns = By.linkText("Get Started");

	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
	}

	public void getStarted_Array() {
		GetStartedBtns.click();
	}

	public List<String> showArrayTopics() {
		List<WebElement> array_topics = driver.findElements(arrayTopics);
		List<String> array_topix = new ArrayList<String>();
		System.out.println("PRINT ALL DATA LIST" + array_topics.size());
		for (WebElement e : array_topics) {
			String text = e.getText();
			System.out.println("PRINT ALL DATA LIST" + text);
			array_topix.add(text);
		}

		return array_topix;
	}

	public void clickon_arrays_using_list() throws InterruptedException {
		Thread.sleep(1000);
		arrays_using_list.click();
	}

	public void clickonArray_inPython() throws InterruptedException {
		Thread.sleep(1000);
		array_in_python.click();
	}
	public void clickon_basic_Operations_in_Lists() throws InterruptedException {
		Thread.sleep(1000);
		basic_Operations_in_Lists.click();
	}
	
	public void clickon_applications_of_array() throws InterruptedException {
		Thread.sleep(1000);
		applications_of_array.click();
	}
	public void clickonTry() {
		TryHere.click();
	}

	public void click_on_RunBTN() {
		runBtn.click();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}
}
