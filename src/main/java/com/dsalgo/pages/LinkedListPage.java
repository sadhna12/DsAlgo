package com.dsalgo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedListPage 

{
	private WebDriver driver;

	// @FindBy(xpath = "//*[@class=\"list-group-item\"]")
	// WebElement GetStartedBtns;

	@FindBy(xpath = "//*[text()='Arrays in Python']")
	WebElement array_in_python;
	
	

	@FindBy(linkText  = "Introduction")
	WebElement introduction;
	
	@FindBy(linkText  = "Creating Linked LIst")
	WebElement creatingLinkedLIst;
	
	@FindBy(linkText  = "Types of Linked List")
	WebElement typesofLinkedList;
	
	@FindBy(linkText  = "Implement Linked List in Python")
	WebElement ImplementLinked;
	
	@FindBy(linkText  = "Traversal")
	WebElement traversal;
	
	@FindBy(linkText  = "Insertion")
	WebElement insertion;
	
	@FindBy(linkText  = "Deletion")
	WebElement deletion;

		
	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practice_que;

	// @FindBy(xpath = "//*[@class=\"list-group-item\"]")
	// WebElement arrayTopics;

	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement TryHere;

	@FindBy(xpath = "//*[@onclick=\"runit()\"]")
	WebElement runBtn;

	private By LinkedlistTopics = (By.tagName("ul"));

	// private By GetStartedBtns = By.linkText("Get Started");

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
	}

	

	public List<String> showLinkedLisTopics() {
		List<WebElement> array_topics = driver.findElements(LinkedlistTopics);
		List<String> array_topix = new ArrayList<String>();
		System.out.println("print linkedlist topics    " + array_topics.size());
		for (WebElement e : array_topics) {
			String text = e.getText();
			System.out.println("print linkedlist topics   " + text);
			array_topix.add(text);
		}

		return array_topix;
	}
	
	public void clickonIntroduction() {
		introduction.click();
	}
	
	public void clickoncreatingLinkedLIst() {
		creatingLinkedLIst.click();
	}
	public void clickontypesofLinkedList() {
		typesofLinkedList.click();
	}
	public void clickonImplementLinked() {
		ImplementLinked.click();
	}
	public void clickonTraversal() {
		traversal.click();
	}
	public void clickonInsertion() {
		insertion.click();
	}
	
	public void clickonDeletion() {
		deletion.click();
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



