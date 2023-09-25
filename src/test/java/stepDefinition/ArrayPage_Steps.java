package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.ApplicationsofArrayPage;
import com.dsalgo.pages.ArrayInPythonPage;
import com.dsalgo.pages.ArrayPage;
import com.dsalgo.pages.ArrayUsingListPage;
import com.dsalgo.pages.BasicOperations_InList;
import com.dsalgo.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPage_Steps 

{    public WebDriver driver = DriverFactory.getDriver();
	HomePage homePage =new HomePage(DriverFactory.getDriver());
	public  ArrayInPythonPage array_in_python= new ArrayInPythonPage(driver) ;
	public  ArrayUsingListPage array_using_listPage= new ArrayUsingListPage(driver);
	
	public  BasicOperations_InList basic_opr_list= new BasicOperations_InList(driver);
	ApplicationsofArrayPage applicationsofArrayPage=new ApplicationsofArrayPage(driver);
	
	
      ArrayPage AP_obj=new ArrayPage (driver);
	@When("user clicks on Get started button under Array module")
	public void user_clicks_on_get_started_button_under_array_module() 
	{
		 AP_obj = homePage.goTo_ArrayModule();
	}

	@Then("user is navigated to Array Page")
	public void user_is_navigated_to_array_page() 
	{
		//AP_obj.getHomePageTitle();
	}

	@Then("user can see following links under Topics Covered")
	public void user_can_see_following_links_under_topics_covered(DataTable arrayTpics) 
	{
		AP_obj.showArrayTopics();
		
		List<String>expectedPanesList=arrayTpics.asList();
		   System.out.println("expected DSList  "+expectedPanesList);
			List<String>actualDSList= AP_obj.showArrayTopics();
			   System.out.println("actual DSList  "+actualDSList);
	}

	@When("user clicks on Array in python")
	public void user_clicks_on_array_in_python() throws InterruptedException 
	{
		//array_in_python=new ArrayInPythonPage(driver);
		array_in_python.clickonArray_inPython();
		//AP_obj.clickonArray_inPython();
	}

	@Then("user should redirect to \"Array in python page\"page")
	public void user_should_redirect_to_array_in_python_page_page() 
	{
		array_in_python.getHomePageTitle();
		
		  System.out.println("HomePageTitle  "+array_in_python.getHomePageTitle());
	}

	@Given("user is on Array in python page")
	public void user_is_on_array_in_python_page() 
	{
		 System.out.println("HomePageTitle  "+array_in_python.getHomePageTitle());
		 String  actual=array_in_python.getHomePageTitle();
		 String expected="arrays-in-python";
		 System.out.println("Actual page "+actual);
		 System.out.println("expected page "+expected);
		 
		 //Assert.assertTrue(actual.contains(expected));
	}

	@When("user clicks on try here button")
	public void user_clicks_on_try_here_button() 
	{
		array_in_python.user_clicks_on_try_here_button();
	}
	
	@Given("user is on tryEditor")
	public void user_is_on_try_editor() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("HomePageTitle  "+array_in_python.getHomePageTitle());
	}

	@When("user runs the code {string}")
	public void user_runs_the_code(String string) throws InterruptedException 
	{
		array_in_python.user_runs_the_code(string);
	}

	@Then("user clicks on run button")
	public void user_clicks_on_run_button() 
	{
		array_in_python.user_clicks_on_RunButton();
	}

	@Then("user validates output")
	public void user_validates_output() 
	{
	   
	}

	@When("user clicks on Arrays using list")
	public void user_clicks_on_arrays_using_list() throws InterruptedException {
		//array_using_listPage =new ArrayUsingListPage(driver);
		array_using_listPage.clickon_arrays_using_list();
	  
	}

	@Then("user should redirect to \"Arrays using list\"page")
	public void user_should_redirect_to_arrays_using_list_page() 
	{
		
		 System.out.println("HomePageTitle  "+array_using_listPage.getHomePageTitle());
		array_using_listPage.getHomePageTitle();
	}

	@Given("user is on Arrays using list")
	public void user_is_on_arrays_using_list() 
	{
		 System.out.println("HomePageTitle  "+array_using_listPage.getHomePageTitle());
	}

	@When("user clicks on Basic Operations in Lists")
	public void user_clicks_on_basic_operations_in_lists() throws InterruptedException 
	{
		basic_opr_list.clickon_BasicOperations_InList();
	}

	@Then("user should redirect to \"Basic Operations in Lists\"page")
	public void user_should_redirect_to_basic_operations_in_lists_page() 
	{
		System.out.println("HomePageTitle  "+basic_opr_list.getHomePageTitle());
	}

	@Given("user is on Basic Operations in Lists")
	public void user_is_on_basic_operations_in_lists() 
	{
		System.out.println("HomePageTitle  "+basic_opr_list.getHomePageTitle());
	}

	@When("user clicks on Applications of Array")
	public void user_clicks_on_applications_of_array() throws InterruptedException 
	{
		applicationsofArrayPage.clickonApplicationsofArrayPage();
	}

	@Then("user should redirect to \"Applications of Array\"page")
	public void user_should_redirect_to_applications_of_array_page() 
	{
		System.out.println("HomePageTitle  "+applicationsofArrayPage.getHomePageTitle());
	}

	@Given("user is on Applications of Array")
	public void user_is_on_applications_of_array() 
	{
		System.out.println("HomePageTitle  "+applicationsofArrayPage.getHomePageTitle());
	 
	}
	

}