package dsAlgo_StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.LinkedList;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_SD {
//
	LinkedList linkedList;
	WebDriver driver;
	WebDriverWait wait;

	public LinkedList_SD() {
		System.out.println("LinkedList_SD**********************");
		driver = DriverFactory.initiateDriver();
		linkedList = new LinkedList(driver);
	}

	@Given("LinkedList User launches DsAlgo app url {string}")
	public void user_launches_ds_algo_app_url(String string) {
		driver.get(string);
	}

	@When("User clicks {string} Button")
	public void user_clicks_button(String string) {
		if (string.equalsIgnoreCase("Get Started")) {
			linkedList.ClickGetStBtn();
		} else if (string.equalsIgnoreCase("Sign In")) {
			linkedList.SignBtn();
		}

	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		System.out.println("String value: " + string);

		if (string.equalsIgnoreCase("Login")) {
			linkedList.Loginbtn();
		}
	}

	@Then("User is on the {string} page")
	public void user_is_on_the_page(String string) {
		String loginPageTitle = DriverFactory.getTitle();
		Assert.assertEquals(string, loginPageTitle);
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		linkedList.Username();
		linkedList.Password();
	}

	@Then("User should see the Home page on successful login status {string}")
	public void user_should_see_the_home_page_on_successful_login_status(String string) {
		Assert.assertEquals(string, linkedList.statusMessage());
	}

	@Given("the user is on the Home page after signing in")
	public void the_user_is_on_the_home_page_after_signing_in() {
		driver.getCurrentUrl();
	}

	@Given("the Linked List user is redirct the Home page")
	public void the_user_is_on_the_home_page() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("the user clicks the {string} button in the Linked List panel")
	public void the_user_clicks_the_button_in_the_linked_list_panel(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
	}

//
	@When("user selects {string} from the dropdown menu")
	public void the_user_selects_from_the_dropdown_menu(String string) {
		linkedList.dropdownMenuClick();
		linkedList.clickLinkedListFromDropdown();
	}

//
	@Then("the user should be directed to the {string} data structure page")
	public void the_user_should_be_directed_to_the_data_structure_page(String string) {
		Assert.assertEquals(string, linkedList.titleLinkedList());
	}

	@Given("the user is on the Linked List page after signing in")
	public void the_user_is_on_the_linked_list_page_after_signing_in() {
		driver.getCurrentUrl();
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		linkedList.clickIntrodcution();

	}

	@Then("the user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		driver.getCurrentUrl();
	}

	@Given("user is on {string} page")
	public void user_is_on_page(String string) {
//		driver.getCurrentUrl();
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");

	}

	@When("user clicks {string} button in {string} page")
	public void user_clicks_button_in_page(String string, String string2) {
		linkedList.tryHereBtnClick();
	}

	@Then("The user should be redirected to a page having a try Editor with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_to_test(String string) {
		Assert.assertEquals(string, linkedList.runBtnText());

	}

	@Given("LinkedUser is on the {string} page")
	public void linked_user_is_on_the_page(String string) {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@When("LinkedUser clicks the Run Button without entering the code in the Editor")
	public void linked_user_the_run_button_without_entering_the_code_in_the_editor() {
		linkedList.inputEditor();
		linkedList.runBtnClick();

	}

	@Then("LinkedUser should  able to see {string} in alert window")
	public void linked_user_should_able_to_see_in_alert_window(String string) {
		Assert.assertEquals(string, linkedList.alertMessage());

	}

	@When("LinkedUser clicks the Run Button by entering invalid python code in the Editor")
	public void linked_user_clicks_the_run_button_by_entering_invalid_python_code_in_the_editor() {
		linkedList.inputEditorInvalid();
		linkedList.runBtnClick();
	}

	@Then("LinkedUser should able to see an {string} message in alert window")
	public void linked_user_should_able_to_see_an_message_in_alert_window(String string) {
		Assert.assertEquals(string, linkedList.alertMessage());
	}

	@When("LinkedUser clicks the Run Button by entering valid python code in the Editor")
	public void linked_user_clicks_the_run_button_by_entering_valid_python_code_in_the_editor() {
		linkedList.inputEditorValid();
		linkedList.runBtnClick();
	}

	@Then("LinkedUser should able to see {string} in the console")
	public void linked_user_should_able_to_see_in_the_console(String string) {
		Assert.assertEquals(string, linkedList.console());
	}

	@Given("LinkedUser is in the Linked List page")
	public void linked_user_is_in_the_linked_list_page() {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.getTitleLinked();
	}

	@When("LinkedUser clicks {string} button")
	public void linked_user_clicks_button(String string) {
		linkedList.creatingLinkedListClick();
	}

	@Then("LinkedUser should be redirected to Creating Linked LIst page")
	public void linked_user_should_be_redirected_to_creating_linked_l_ist_page() {
		Assert.assertEquals("Creating Linked LIst", linkedList.getTitleCreatingLinkedList());

	}

//	@Then("LinkedUser should be redirected to {string} page")
//	public void linked_user_should_be_redirected_to_page(String string) {
//		System.out.println(string);
//		if(string.equalsIgnoreCase(linkedList.getTitleCreatingLinkedList())) {
//	Assert.assertEquals(string,linkedList.getTitleCreatingLinkedList()); 
//	}
//		else if(string.equalsIgnoreCase(linkedList.getTitleTypeOfLinked())) {
//			
//			Assert.assertEquals(string,linkedList.getTitleTypeOfLinked()); 
//					}
//
//		}

	@Given("LinkedUser is on the Creating Linked LIst page")
	public void linked_user_is_on_the_creating_linked_l_ist_page() {
		linkedList.clcikGetStartedLinkedListBtn();

		linkedList.creatingLinkedListClick();

		linkedList.getTitleCreatingLinkedList();
	}

	@When("LinkedUser clicks {string}  button in  Creating Linked LIst page")
	public void linked_user_clicks_button_in_creating_linked_l_ist_page(String string) {
		linkedList.tryHereBtnClick();

	}

	@Then("LinkedUser should be redirected to a page having a try Editor with a {string} button to test")
	public void linked_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_button_to_test(String tryEditor) {
		Assert.assertEquals(tryEditor, linkedList.runBtnText());

	}

	@Given("LinkedUser is on the Types of Linked List page")
	public void linked_user_is_on_the_types_of_linked_list_page() {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.typeOfLinkListinkClick();
		linkedList.getTitleTypeOfLinked();
	}

	@When("LinkedUser clicks Types of Linked List button")
	public void linked_user_clicks_types_of_linked_list_button() {
		linkedList.typeOfLinkListinkClick();

	}

	@Then("LinkedUser should be redirected to Types of Linked List page")
	public void linked_user_should_be_redirected_to_types_of_linked_list_page() {
		Assert.assertEquals("Types of Linked List", linkedList.getTitleTypeOfLinked());

	}

	@Given("LinkedUser is on the Implement Linked List in Python page")
	public void linked_user_is_on_the_implement_linked_list_in_python_page() {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.implimentLinkedListClick();
		linkedList.getTitleImplimentLinked();
	}

	@When("LinkedUser clicks Implement Linked List in Python button")
	public void linked_user_clicks_implement_linked_list_in_python_button() {
		linkedList.implimentLinkedListClick();

	}

	@Then("LinkedUser should be redirected to Implement Linked List in Python page")
	public void linked_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		Assert.assertEquals("Implement Linked List in Python", linkedList.getTitleImplimentLinked());

	}

	@When("LinkedUser clicks {string}  button in  Implement Linked List in Python page")
	public void linked_user_clicks_button_in_implement_linked_list_in_python_page(String string) {
		linkedList.tryHereBtnClick();

	}

	@When("LinkedUser clicks Traversal button")
	public void linked_user_clicks_traversal_button() {
		linkedList.traversalClick();
	}

	@Then("LinkedIser should be redirected to Traversal page")
	public void linked_iser_should_be_redirected_to_traversal_page() {
		Assert.assertEquals("Traversal", linkedList.getTitleTraversal());
	}

	@Given("LinkedUser is on the Traversal page")
	public void linked_user_is_on_the_traversal_page() {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.traversalClick();
		;
		linkedList.getTitleTraversal();
	}

	@When("LinkedUser clicks Insertion button")
	public void linked_user_clicks_insertion_button() {
		linkedList.insertionClick();
	}

	@Then("LinkedIser should be redirected to Insertion page")
	public void linked_iser_should_be_redirected_to_insertion_page() {
		Assert.assertEquals("Insertion", linkedList.getTitleInsertionLink());
	}

	@Given("LinkedUser is on the Insertion page")
	public void linked_user_is_on_the_insertion_page() {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.insertionClick();
		linkedList.getTitleInsertionLink();
	}

	@Given("LinkedUser is on the Linked List page")
	public void linked_user_is_on_the_linked_list_page() {
		linkedList.clcikGetStartedLinkedListBtn();
	}

	@Given("LinkedUser is on the try Editor page")
	public void linked_user_is_on_the_try_editor_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("LinkedUser clicks {string}  button in  Insertion page")
	public void linked_user_clicks_button_in_insertion_page(String string) {
		linkedList.tryHereBtnClick();

	}

	@When("LinkedUser clicks Deletion button")
	public void linked_user_clicks_deletion_button() {
		linkedList.deletionClick();
	}

	@Then("LinkedIser should be redirected to Deletion page")
	public void linked_iser_should_be_redirected_to_deletion_page() {
		Assert.assertEquals("Deletion", linkedList.getTitleDeletionLink());

	}

}