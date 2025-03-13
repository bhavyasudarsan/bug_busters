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

		 driver = DriverFactory.getDriver();
		stack = new Stack(driver);
	}

	@Given("Stack user launches DsAlgo app url {string}")
	public void user_launches_ds_algo_app_url(String string) {
		stack.getUrl();
	}

	@When("Stack user clicks {string} Button")
	public void user_clicks_button(String string) {
		if (string.equalsIgnoreCase("Get Started")) {
			stack.ClickGetStBtn();
		} else if (string.equalsIgnoreCase("Sign In")) {
			stack.signInbtnWithWait();
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
		String loginPageTitle = driver.getTitle();
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
		stack.currentURL();
	}

	@When("Stack user selects Stack from the dropdown menu")
	public void user_selects_stack_from_the_dropdown_menu() {
		stack.dropDownStack();
		stack.dropDownSelectStack();
	}

	@Then("Stack user should be directed to the Stack data structure page")
	public void the_user_should_be_directed_to_the_stack_data_structure_page() {
		Assert.assertEquals("Stack", stack.titleStack());
	}

	@Given("Stack user is redirct the Home page")
	public void stack_is_redirct_the_home_page() {
		stack.statusMessage();
	}

	@When("Stack user clicks the Stack button in the Stack panel")
	public void stack_clicks_the_stack_button_in_the_stack_panel() {
		stack.clickGetStartedStackBtn();
	}

	@Given("The Stack user is in the Stack page")
	public void the_stack_user_is_in_the_stack_page() {
		stack.clickGetStartedStackBtn();
	}

	@When("The Stack user clicks Operations in Stack button")
	public void the_stack_user_clicks_operations_in_stack_button() {
		stack.operationLinkBtnClick();
	}

	@Then("The  Stack user be directed to Operations in Stack Page")
	public void the_stack_user_be_directed_to_operations_in_stack_page() {
		Assert.assertEquals("Operations in Stack", stack.stackPageIdentify());
	}

	@Given("The stack user is in the {string} page")
	public void the_stack_user_is_in_the_page(String string) {
		stack.clickGetStartedStackBtn();

		switch (string) {
		case "Operations in Stack":
			stack.operationLinkBtnClick();
			stack.stackPageIdentify();
			break;
		case "Implementation":
			stack.linkImplementationClick();
			stack.implementationPageIdentify();
			break;
		case "Applications":
			stack.linkApplicationClick();
			stack.applicationPageIdentify();
			break;

		}
	}

	@When("The stack user clicks {string} button in Stack page")
	public void the_stack_user_clicks_button_in_stack_page(String string) {
		stack.tryHereBtnClick();
	}

	@Then("The stack user should be redirected to a page having a try Editor with a {string} button to test")
	public void the_stack_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_button_to_test(String string) {
		Assert.assertEquals(string, stack.runBtnText());
	}

	@Given("The stack user is on the {string} page")
	public void the_stack_user_is_on_the_page(String string) {
		stack.tryEditorPage();
	}

	@When("The stack user clicks the Run Button without entering the code in the Editor")
	public void the_stack_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		stack.runBtnClick();
	}

	@Then("The stack user should able to see {string} in alert window")
	public void the_stack_user_should_able_to_see_in_alert_window(String string) {
		Assert.assertEquals(string, stack.alertMessage());
	}

	@When("The stack user clicks the Run Button by entering invalid code  in the Editor")
	public void the_stack_user_clicks_the_run_button_by_entering_invalid_code_in_the_editor() {
		stack.inputEditorInvalid();
		stack.runBtnClick();
	}

	@Then("The stack user should able to see an {string} in alert window")
	public void the_stack_user_should_able_to_see_an_error_message_in_alert_window(String string) {
		Assert.assertEquals("NameError: name 'hii' is not defined on line 1", stack.alertMessage());
	}

	@When("The stack user clicks the Run Button by entering valid code  in the Editor")
	public void the_stack_user_clicks_the_run_button_by_entering_valid_code_in_the_editor() {
		stack.inputEditorValid();
		stack.runBtnClick();
	}

	@Then("The stack user should able to see {string}  in alert window")
	public void the_stack_user_should_able_to_see_output_in_alert_window(String string) {
		Assert.assertEquals(string, stack.console());
	}

	@When("The Stack user clicks Implementation in Stack button")
	public void the_stack_user_clicks_implementation_in_stack_button() {
		stack.linkImplementationClick();
	}

	@Then("The  Stack user be directed to Implementation  Page")
	public void the_stack_user_be_directed_to_implementation_page() {
		Assert.assertEquals("Implementation", stack.implementationPageIdentify());
	}

	@When("The Stack user clicks Applications in Stack button")
	public void the_stack_user_clicks_applications_in_stack_button() {
		stack.linkApplicationClick();
	}

	@Then("The  Stack user be directed to Applications  Page")
	public void the_stack_user_be_directed_to_applications_page() {
		Assert.assertEquals("Applications", stack.applicationPageIdentify());
	}
}
