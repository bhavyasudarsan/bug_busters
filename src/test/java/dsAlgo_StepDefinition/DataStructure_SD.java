package dsAlgo_StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import dsAlgo_PageObjects.DataStructure_PF;

public class DataStructure_SD {
	
	DataStructure_PF data_strcture_PF = new DataStructure_PF();
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		
		data_strcture_PF.getStart();
		data_strcture_PF.signIn();
	}
	@When("user enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
		System.out.println("User Name: "+ username);
		System.out.println("Password: "+ password);
		data_strcture_PF.enterCredentials(username, password);
	}
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		
		data_strcture_PF.clickLogin();
	}
	@Then("user should see the Home page on successful login status {string}")
	public void user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		
		Assert.assertEquals(data_strcture_PF.getStatus(), expectedStatus);
	    System.out.println("\n You are Home Page \n");
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in()  {
		
		System.out.println("\n User is on the Home Page\n ");
	}
	@When("The user clicks the Get Started button in Data Structure Page")
	public void the_user_clicks_the_get_started_button_in_data_structure_page(){
	
		data_strcture_PF.data_structureGetSatrted();	
	
	}
	@Then("The user be directed to {string} Page")
	public void the_user_be_directed_to_page(String string) {
	 
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		System.out.println("\n You are on data structure page \n");
	}
	
	@Given("The user is in the Data Structures page")
	public void the_user_is_in_the_data_structures_page() {
		
		data_strcture_PF.data_structureGetSatrted(); 
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		
		data_strcture_PF.timeComplexity(); 
	}
	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		System.out.println("\n You are on time complexity page \n");
	}
	
	@Given("The user is in the Time Complexity page of data structure")
	public void the_user_is_in_the_time_complexity_page_of_data_structure() {
		
		data_strcture_PF.data_structureGetSatrted(); 
		data_strcture_PF.timeComplexity(); 
	}
	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		
		data_strcture_PF.practiceQuestion();   
	}
	@Then("The user should see the redirected to {string} page")
	public void the_user_should_see_the_redirected_to_page(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		System.out.println("\n You are on practice question page \n");
	}
	
	
	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page()  {
		
		data_strcture_PF.data_structureGetSatrted();  
		data_strcture_PF.timeComplexity(); 
	}
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		
		data_strcture_PF.timeComplexityTryhere(); 
	}
	@Then("The user should be redirected to a page having an {string} with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_run_button_to_test(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		System.out.println("\n You are on Try Editor page \n");
	}
	
	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		
		data_strcture_PF.data_structureGetSatrted();  
		data_strcture_PF.timeComplexity(); 
		data_strcture_PF.timeComplexityTryhere();
	}
	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor()  {
		
		data_strcture_PF.textEditorWithNoData();
	}
	@Then("The user should able to see an error message")
	public void the_user_should_able_to_see_an_error_message() {
		
		Assert.assertEquals(data_strcture_PF.alertMessage(), "Enter code in Try editor box");
		System.out.println("\n You are on Try Editor page \n");
		System.out.println("Error message not populated");
	}
	
	@When("The user write the invalid code in Editor and click the Run button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
	   
		data_strcture_PF.textEditorWithInvalidData();
	}

	@Then("The user should able to see an {string} message in alert window")
	public void the_user_should_able_to_see_an_message_in_alert_window(String string) {
		
		Assert.assertEquals(data_strcture_PF.alertMessage(), string);
	}

	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
	    
		data_strcture_PF.textEditorWithValiddData();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	   
		Assert.assertEquals("Hello", data_strcture_PF.getStatusTextEditor());
		
	}
}
