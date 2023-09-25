package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.dsalgo.factory.DriverFactory;
import com.dsalgo.pages.ArrayInPythonPage;
import com.dsalgo.pages.FindNumbersEvenDigitsPage;
import com.dsalgo.pages.MaxConsecutiveOnesPage;
import com.dsalgo.pages.PracticeQuestions;
import com.dsalgo.pages.SearchTheArrayPage;
import com.dsalgo.pages.SquaresofSortedArrayPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeQuestion_Steps {
	WebDriver driver = DriverFactory.getDriver();
	ArrayInPythonPage arrayInPythonPage = new ArrayInPythonPage(driver);
	PracticeQuestions practiceQuestions = new PracticeQuestions(driver);
	
	
	
	
	//ArrayPage ap=new ArrayPage(driver);
	
	SearchTheArrayPage SearchTheArrayPage=new SearchTheArrayPage(driver);
		MaxConsecutiveOnesPage maxConsecutiveOnesPage=new MaxConsecutiveOnesPage(driver);
		FindNumbersEvenDigitsPage findNumbersEvenDigitsPage=new FindNumbersEvenDigitsPage(driver);
	SquaresofSortedArrayPage squaresofSortedArrayPage=new SquaresofSortedArrayPage(driver);
	
	  @When("user clicks on practice Question")
	  public void user_clicks_on_practice_question() {
		  arrayInPythonPage.user_clicks_onPracticeQuestion();
	  }

	@Then("user should redirect to practice Question page")
	public void user_should_redirect_to_practice_question_page() {
		System.out.println(practiceQuestions.getHomePageTitle());
	}

	@Given("user is on practice Question page")
	public void user_is_on_practice_question_page() {
		System.out.println(practiceQuestions.getHomePageTitle());
	}

	@When("user click on search the Array Link")
	public void user_click_on_search_the_array_link() 
	{
		SearchTheArrayPage.searchTheArray();
	}

	@Then("The user should be redirected to Question  contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_contains_a_question_an_try_editor_with_run_and_submit_buttons() {
		SearchTheArrayPage.getHomePageTitle();
	}

	@When("user write the code")
	public void user_write_the_code() 
	{
		SearchTheArrayPage.writeTheCode();
	}

	@When("User click on the Run Button")
	public void user_click_on_the_run_button() {
		SearchTheArrayPage.runCode();
	}

	@When("user click on the submit button")
	public void user_click_on_the_submit_button() {
		SearchTheArrayPage.submitCode();
	  
	}

	@When("user click on  Max Consecutive Ones earch the Array Link")
	public void user_click_on_max_consecutive_ones_earch_the_array_link() 
	{
		maxConsecutiveOnesPage.click_MaxConsecutiveOnes();
	}

	@Then("The user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String string)
	{
		System.out.println(maxConsecutiveOnesPage.getHomePageTitle());
	  
		}

	

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) 
	{
		maxConsecutiveOnesPage.writeTheCode();
		}

	@Then("The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_an_try_editor_with_run_and_submit_buttons() {
		System.out.println(maxConsecutiveOnesPage.getHomePageTitle());
	}

	@When("The user clicks Find Numbers with Even Number of Digits link")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link()
	{
		findNumbersEvenDigitsPage.findNumbers_EvenDigitsPage();
	}

	@When("The user clicks Squares of a  Sorted Array link")
	public void the_user_clicks_squares_of_a_sorted_array_link() 
	{
		squaresofSortedArrayPage.squaresof_SortedArrayPage();
	}
	

	

	@Then("user should redirect to Array in python page page")
	public void user_should_redirect_to_array_in_python_page_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



//	@When("user clicks on practice Question")
//	public void user_clicks_on_practice_question() {
//		arrayInPythonPage.user_clicks_onPracticeQuestion();
//	}
//
//	@Then("user should redirect to practice Question page")
//	public void user_should_redirect_to_practice_question_page() {
//		System.out.println(practiceQuestions.getHomePageTitle());
//	}
//	
//	@Given("user is on practice Question page")
//	public void user_is_on_practice_question_page1() {
//	    
//	}
//
//	@When("user click on search the Array  Link")
//	public void user_click_on_search_the_array_link() {
//		practiceQuestions.searchTheArray();
//		
//	}
//
//	@Then("The user should be redirected to Question  contains a question,an tryEditor with Run and Submit buttons")
//	public void the_user_should_be_redirected_to_question_contains_a_question_an_try_editor_with_run_and_submit_buttons() {
//		System.out.println(practiceQuestions.getHomePageTitle());
//	}
//
//	@Given("User is on practice Question page")
//	public void user_is_on_practice_question_page() {
//		System.out.println(practiceQuestions.getHomePageTitle());
//	}
//	
//	
//	
//
//	@When("user write the code")
//	public void user_write_the_code() 
//	{
//		//practiceQuestions.writeCode();
//		System.out.println("write code");
//	}
//
//	@When("User click on the Run Button")
//	public void user_click_on_the_run_button() {
//	//	practiceQuestions.runCode();
//		System.out.println("runcode");
//	}
//
//	@When("user click on the submit button")
//	public void user_click_on_the_submit_button() 
//	{
//		//practiceQuestions.submitCode();
//		
//		System.out.println("click");
//	}
//
//	@When("user click on Max Consecutive Ones link")
//	public void user_click_on_max_consecutive_ones_link() {
//		practiceQuestions.nax_Consecutive_Ones();
//		
//	}
//
//	@Then("The user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
//	public void the_user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(
//			String string) {
//		System.out.println(practiceQuestions.getHomePageTitle());
//	}
//
//	@When("The user clicks Find Numbers with Even Number of Digits link")
//	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
//		//practiceQuestions.find_Numbe_with_Even_Number();
//	}
//
//	@Then("The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons")
//	public void the_user_should_be_redirected_to_question_page_contains_a_question_an_try_editor_with_run_and_submit_buttons() {
//		System.out.println(practiceQuestions.getHomePageTitle());
//	}
//
//	@When("The user clicks Squares of a  Sorted Array link")
//	public void the_user_clicks_squares_of_a_sorted_array_link() {
//		//practiceQuestions.squares_of_Sorted_Array();
//	}


}
