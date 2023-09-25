package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.DataStructureIntroduction;
import com.dsalgo.pages.HomePage;
import com.dsalgo.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureIntroduction_Steps {
	
	public WebDriver driver = DriverFactory.getDriver();
	public HomePage homePage/* =new HomePage(DriverFactory.getDriver()) */;
	Properties prop;
	
	DataStructureIntroduction data_StructureIntroduction=new DataStructureIntroduction(DriverFactory.getDriver()) ;
	LoginPage loginpg/* = new LoginPage(DriverFactory.getDriver()) */;
	//String loginpage_url="https://dsportalapp.herokuapp.com/login";
	
	@Given("user has successfully logged into application")
	public void user_has_successfully_logged_into_application(DataTable dataTable)
	{
		loginpg = new LoginPage(driver);

	List<Map<String,String>> credList=dataTable.asMaps();
	String un=	credList.get(0).get("username");
	String pswd=credList.get(0).get("password");
	System.out.println("user name and password   " +  un  +" " +  pswd );
     // DriverFactory.getDriver().get(loginpage_url);	
	      try {
			homePage=loginpg.doLogin(un, pswd);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   Assert.assertTrue(driver.getCurrentUrl().contains("home"));
	}

	@When("user clicks on Get started button under Data Structures-Introductio module")
	public void user_clicks_on_get_started_button_under_data_structures_introductio_module() throws InterruptedException 
	{
		data_StructureIntroduction = homePage.goTo_DataStructureModule();
		//data_StructureIntroduction.clickOnGetStarted();
	}

	@Then("user is navigated to Data Structures-Introductio Page")
	public void user_is_navigated_to_data_structures_introductio_page()
	{
		//data_StructureIntroduction.getTitlePage();
	}

	@Then("verify data structure title page")
	public void verify_data_structure_title_page() 
	{
		
		
		data_StructureIntroduction.getTitlePage();
		
	}

	@When("User clicks on Time Complexity")
	public void user_clicks_on_time_complexity() 
	{
		data_StructureIntroduction.clickOn_TimeComplexity();
	}

	@Then("The user should be redirected to {string} of Data structures-Introduction")
	public void the_user_should_be_redirected_to_of_data_structures_introduction(String string) {
		data_StructureIntroduction.getTitlePage();
	    
	}

	@Given("user is on {string} page")
	public void user_is_on_page(String string)
	{
		data_StructureIntroduction.getTitlePage();
	}

		@When("user clicks on Practice Questions button")
	public void user_clicks_on_practice_questions_button()
		{
			data_StructureIntroduction.clickOnPractice();
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
	   
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() 
	{
		data_StructureIntroduction.getTitlePage();

	}

}
