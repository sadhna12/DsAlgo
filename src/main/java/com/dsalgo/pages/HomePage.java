package com.dsalgo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.factory.DriverFactory;

public class HomePage extends DriverFactory

{

	private WebDriver driver;
	@FindBy(linkText = "NumpyNinja")

	WebElement title;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement userlabelname;

	@FindBy(xpath = "//a[contains(@href,'data-structures-introduction')]")
	WebElement dat_str_get_strt;

	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a")
	WebElement dataStructuremoduleOPtion;

	@FindBy(xpath = "//h5[text()='Array']/..//a")
	WebElement ArraymoduleOPtion;
	
	@FindBy(xpath = "//h5[text()='Linked List']/..//a")
	WebElement LinkedListModule;
	
	

//@FindBy(xpath="//*[@class=\"card-body d-flex flex-column\"]")
//WebElement DS_allPanes;
	private By DS_allPanes = By.xpath("//*[@class=\"col\"]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<String> getAllpanes() {

		List<String> Dspaneslist = new ArrayList<String>();

		List<WebElement> DS_Panes = driver.findElements(DS_allPanes);
		System.out.println("PRINT ALL DATA LIST" + DS_Panes.size());

		for (WebElement e : DS_Panes) {
			String text = e.getText();
			System.out.println("PRINT ALL DATA LIST" + text);
			Dspaneslist.add(text);
		}
		return Dspaneslist;
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	/*
	 * private WebElement getToModule(String moduleName) { By moduleGetStartedBtn =
	 * By.xpath("//h5[text()='" + moduleName + "']/..//a"); WebElement ele =
	 * driver.findElement(moduleGetStartedBtn); return ele; }
	 */

	public DataStructureIntroduction goTo_DataStructureModule() {
		dataStructuremoduleOPtion.click();
		;
		return new DataStructureIntroduction(driver);
	}

	public ArrayPage goTo_ArrayModule() {
		ArraymoduleOPtion.click();
		;
		return new ArrayPage(driver);
	}
	
	public ArrayPage goTo_LinkedListModule() {
		LinkedListModule.click();
		;
		return new ArrayPage(driver);
	}
}
