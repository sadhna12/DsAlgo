package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.HomePage;
import com.dsalgo.pages.LinkedListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_Steps 
{
	
	 public WebDriver driver = DriverFactory.getDriver();
	HomePage homePage =new HomePage(DriverFactory.getDriver());
	
	LinkedListPage linkedListPage =new LinkedListPage(driver);
	
	
	@When("user clicks on Get started button under LinkedList module")
	public void user_clicks_on_get_started_button_under_linked_list_module() {
		homePage.goTo_LinkedListModule();
	}

	@Then("user is navigated to LinkedList Page")
	public void user_is_navigated_to_linked_list_page() {
	System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
	 
	}

	@When("user clicks on Introduction")
	public void user_clicks_on_introduction() 
	{
		linkedListPage.clickonIntroduction();
	}

	@Then("user should redirect to  Introduction page")
	public void user_should_redirect_to_introduction_page() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
	}

	@Given("user is on Introduction")
	public void user_is_on_introduction() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
	 
	}
	@When("user clicks on Creating Linked LIst")
	public void user_clicks_on_creating_linked_l_ist() {
	    
	
		linkedListPage.clickoncreatingLinkedLIst();
	   
	}
	@Then("user should redirect to  Creating Linked LIst page")
	public void user_should_redirect_to_creating_linked_l_ist_page() 
	{
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
	}

	@Given("user is on Creating Linked LIst")
	public void user_is_on_creating_linked_l_ist() {
		//linkedListPage.clickoncreatingLinkedLIst();
	    
	}

	@When("user clicks on Types of Linked List")
	public void user_clicks_on_types_of_linked_list() {
		linkedListPage.clickontypesofLinkedList();
	   
	}

	@Then("user should redirect to  Types of Linked List")
	public void user_should_redirect_to_types_of_linked_list() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());

	}

	@Given("user is on Creating Types of Linked List")
	public void user_is_on_creating_types_of_linked_list() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
    
	}

	@When("user clicks on Implement Linked List in Python")
	public void user_clicks_on_implement_linked_list_in_python() {
		linkedListPage.clickonImplementLinked(); 
	}

	@Then("user should redirect to  Implement Linked List in Python")
	public void user_should_redirect_to_implement_linked_list_in_python() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());
	}

	@Given("user is on Creating Implement Linked List in Python")
	public void user_is_on_creating_implement_linked_list_in_python() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle());    
	}

	@When("user clicks on Traversal")
	public void user_clicks_on_traversal() {
		linkedListPage.clickonTraversal();; 
	}

	@Then("user should redirect to  Traversal")
	public void user_should_redirect_to_traversal() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 
	}

	@Given("user is on Traversal")
	public void user_is_on_traversal() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 
	}

	@When("user clicks on Insertion")
	public void user_clicks_on_insertion() {
		linkedListPage.clickonInsertion();;   
	}

	@Then("user should redirect to  Insertion")
	public void user_should_redirect_to_insertion() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 
  
	}

	@Given("user is on Insertion")
	public void user_is_on_insertion() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 

	}

	@When("user clicks on Deletion")
	public void user_clicks_on_deletion() {
		linkedListPage.clickonDeletion();
	}

	@Then("user should redirect to  Deletion")
	public void user_should_redirect_to_deletion() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 

	}

	@Given("user is on Deletion")
	public void user_is_on_deletion() {
		System.out.println("Title of the current page  "+linkedListPage.getHomePageTitle()); 

	}
}
