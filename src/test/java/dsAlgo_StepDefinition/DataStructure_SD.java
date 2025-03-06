package dsAlgo_StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.DataStructure_PF;

public class DataStructure_SD {
	
	WebDriver driver; 
	DataStructure_PF data_strcture;
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		
		driver=DriverFactory.initiateDriver();
		DriverFactory.openApp();
		data_strcture =  new DataStructure_PF(driver); 
		data_strcture.getStart(driver);
		data_strcture.signIn();
	}
	@When("user enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
		System.out.println("User Name: "+ username);
		System.out.println("Password: "+ password);
		data_strcture.enterCredentials(username, password);
	}
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		
		data_strcture.clickLogin();
	}
	@Then("user should see the Home page on successful login status {string}")
	public void user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		
		Assert.assertEquals(data_strcture.getStatus(), expectedStatus);
	    System.out.println("Login passed");
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() throws InterruptedException {
		
	//	driver.findElement(null)
		data_strcture.data_structureGetSatrted(driver);
		Thread.sleep(1000);
	}
	@When("The user clicks the Get Started button in Data Structures - Introduction page")
	public void the_user_clicks_the_get_started_button_in_data_structures_introduction_page() throws InterruptedException {
		
		data_strcture.timeComplexity(driver);  
		Thread.sleep(1000);
	}

	@Then("The user should land in {string} Page")
	public void the_user_should_land_in_page(String string) {
		
		Assert.assertEquals(driver.getTitle(), string);
	}
	@Given("The user is in the Data Structures page")
	public void the_user_is_in_the_data_structures_page() throws InterruptedException {
		
		data_strcture.data_structureGetSatrted(driver); 
		data_strcture.timeComplexity(driver); 
		Thread.sleep(1000);
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		
		data_strcture.timeComplexityTryhere(driver); 
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		
		Assert.assertEquals(driver.getTitle(), string);
		System.out.println("you are on time complexity page");
	}
	
	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() throws InterruptedException {
		
		data_strcture.data_structureGetSatrted(driver); 
		data_strcture.timeComplexity(driver); 
		data_strcture.timeComplexityTryhere(driver); 
		Thread.sleep(1000);
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		
		
	    
	}

	@Then("The user should be redirected to a page having an {string} with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_run_button_to_test(String string) {
	    
	}
	
	@After
	public void closeDriver() {
		
		DriverFactory.tearDown();
	}

}
