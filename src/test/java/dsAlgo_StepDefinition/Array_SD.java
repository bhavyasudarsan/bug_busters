package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Array_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_SD {
	
	WebDriver driver;
	Array_PF array ;
	
	
	@Given("Array user is in login page")
	public void array_user_launches_the_ds_algo_application() {
		   driver=DriverFactory.initiateDriver();
		   DriverFactory.openApp();
		   array =  new Array_PF(driver); 
		   array.getStart(driver);
		   array.signIn();
	}

	@When("Array User enters Username as {string} and Password as {string}")
	public void array_user_enters_username_as_and_password_as(String username, String password) {
		System.out.println("User Name: "+ username);
		System.out.println("Password: "+ password);
		
		array.enterCredentials(username, password);
	}

	@When("Array User clicks on Login button")
	public void array_user_clicks_on_login_button() {
		array.clickLogin();
	}

	@Then("Array User should see the Home page on successful login status {string}")
	public void array_user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		Assert.assertEquals(array.getStatus(), expectedStatus);
	    System.out.println("Login passed");
	}
	

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		array.arrayGetStarted(driver);
			System.out.println(driver.getTitle());
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	   array.arraysInPython(driver);
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Arrays in Python");
	}
	
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
	    array.arrayGetStarted(driver);
	    array.arraysInPython(driver);
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    array.arraysInPythonTryHere(driver);
	}

	@Then("The Array user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

}
