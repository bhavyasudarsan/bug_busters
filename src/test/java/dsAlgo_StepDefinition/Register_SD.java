package dsAlgo_StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Register_PF;

public class Register_SD {
	
	WebDriver driver; 
	Register_PF register;
	
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		
		driver=DriverFactory.initiateDriver();
		DriverFactory.openApp();
		register =  new Register_PF(driver); 
		register.getStart(driver);
		register.registerlink();
	}  

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() throws InterruptedException {
		
		register.registerlink();
		Thread.sleep(1000);    
	}
	@Then("The user should be redirected to registration page")
	public void the_user_should_be_redirected_to_registration_page() {
		
		//String string;
		//Assert.assertEquals(driver.getTitle(), string);
		System.out.println("register page");	
	}
	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() throws InterruptedException {
		
		
		register.registerlink();
		register.enterCredentials("", "", "");
		register.btnRegister(driver);
		Thread.sleep(1000);  
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		
		register.registerlink();
		register.enterCredentials("bugbusters", "Team@bug", "Team@bug");
		register.btnRegister(driver);
	    
	}

	@Then("The error {string} appears below Username textbox")
	public void the_error_appears_below_username_textbox(String string) {
		
		
	    
	}
	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
	   
		
	}

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in\"")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in() {
	   
	}
	
	@After
	public void closeDriver() {
		
		DriverFactory.tearDown();
	}

}
