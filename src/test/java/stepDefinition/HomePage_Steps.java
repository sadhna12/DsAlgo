package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Properties;


import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.HomePage;
import com.dsalgo.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Steps {
	public Properties prop;
	 String loginpage_url="https://dsportalapp.herokuapp.com/login";
	HomePage homePage=new HomePage(DriverFactory.getDriver());
	LoginPage loginpg= new LoginPage(DriverFactory.getDriver());
	@Given("user has already logged into application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
	
		List<Map<String,String>> credList=dataTable.asMaps();
	String un=	credList.get(0).get("username");
	String pswd=		credList.get(0).get("password");
	System.out.println("user name and password   " +  un + "  "  +  pswd );
      DriverFactory.getDriver().get(loginpage_url);	
      try {
		homePage=   loginpg.doLogin(un,pswd);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	@When("the user gets the title page")
	public void the_user_gets_the_title_page() 
	{
		homePage.getHomePageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		homePage.getHomePageTitle();
	}

	@Given("user is on home page")
	public void user_is_on_home_page() 
	{
		homePage.getHomePageTitle();
	}

	@Then("user gets all panes of data structure")
	public void user_gets_panes_of_data_structure(DataTable DSpanes) {
	   //.dataTable. Assert.assertTrue(homePage.getAllpanes());
		
		List<String>expectedPanesList=DSpanes.asList();
   System.out.println("expected DSList  "+expectedPanesList);
	List<String>actualDSList= homePage.getAllpanes();
	   System.out.println("actual DSList  "+actualDSList);
	
   
   //homePage.getAllpanes();
	
	}

}
