package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Stack;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_SD {

	Stack stack;
	WebDriver driver;

	public Stack_SD() {
		driver = DriverFactory.initiateDriver();
		stack = new Stack(driver);
	}

	@Given("Stack user launches DsAlgo app url {string}")
	public void user_launches_ds_algo_app_url(String string) {
		driver.get(string);
	}

	@When("Stack user clicks {string} Button")
	public void user_clicks_button(String string) {
		if (string.equalsIgnoreCase("Get Started")) {
			stack.ClickGetStBtn();
		} else if (string.equalsIgnoreCase("Sign In")) {
			stack.signInbtnWithWait(driver);
		}

	}

	@When("Stack user clicks on {string} button")
	public void user_clicks_on_button(String string) {
		System.out.println("String value: " + string);

		if (string.equalsIgnoreCase("Login")) {
			stack.Loginbtn();
		}
	}

	@Then("Stack user is on the {string} page")
	public void user_is_on_the_page(String string) {
		String loginPageTitle = DriverFactory.getTitle();
		Assert.assertEquals(string, loginPageTitle);
	}

	@When("Stack user enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		stack.Username();
		stack.Password();
	}

	@Then("Stack user should see the Home page on successful login status {string}")
	public void user_should_see_the_home_page_on_successful_login_status(String string) {
		Assert.assertEquals(string, stack.statusMessage());
	}

	@Given("Stack user is on the Home page after signing in")
	public void Stack_user_is_on_the_home_page_after_signing_in() {
		driver.getCurrentUrl();
	}

	@When("user selects Stack from the dropdown menu")
	public void user_selects_stack_from_the_dropdown_menu() {
		stack.dropDownStack();
		stack.dropDownSelectStack();
	}

	@Then("the user should be directed to the Stack data structure page")
	public void the_user_should_be_directed_to_the_stack_data_structure_page() {
//		Assert.assertEquals(Stack, linkedList.titleLinkedList());

	}

	@Given("Stack is redirct the Home page")
	public void stack_is_redirct_the_home_page() {
		driver.getCurrentUrl();

	}

	@When("Stack clicks the Stack button in the Stack panel")
	public void stack_clicks_the_stack_button_in_the_stack_panel() {
		stack.clickGetStartedStackBtn();

	}
	

}
