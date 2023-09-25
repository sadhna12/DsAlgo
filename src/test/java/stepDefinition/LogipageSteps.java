package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import parallel.AppHooks;

public class LogipageSteps{
	
	public WebDriver driver;
	static String title;
	private LoginPage loginpage= new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		//loginpage = new LoginPage(driver);
		String loginPgTitle = loginpage.getLoginPageURL();
		
		//String str=loginpage.getLoginPageTitle();
		System.out.println("login page url is  " + loginPgTitle);
		Assert.assertTrue(loginPgTitle.contains("login"));
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
		String str=loginpage.getLoginPageTitle();
		System.out.println("Login Page Title is--------------  "+str);

		Assert.assertTrue(loginpage.getLoginPageTitle().equals("Login"));

	}

	@When("user enters username {string}")
	public void user_enters_username(String usename) {
		loginpage.enterUserName(usename);

	}

	@When("user enters password {string}")
	public void user_enters_password(String pswrd) {
		loginpage.enterPassword(pswrd);

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginpage.clickLoginBtn();
	}

	@Then("user gets the title of the home  page")
	public void user_gets_the_title_of_the_home_page() {
		System.out.println("Home page title is displayed");
	}

	@Then("page title should be {string} home page")
	public void page_title_should_be_home_page(String expectedTitlename) {
		System.out.println("title is " + expectedTitlename);

	}

}
