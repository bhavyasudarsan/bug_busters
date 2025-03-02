package dsAlgo_StepDefinition;


import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.LinkedList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_SD {
	
	LinkedList linkedList;

	@Given("User launches DsAlgo app url {string}")
	public void user_launches_ds_algo_app_url(String string) {
		DriverFactory driverFactory  = DriverFactory.getInstance();
		 linkedList= new LinkedList(driverFactory.getDriver());
		 driverFactory.getDriver().get(string);
	}

	@When("User clicks {string} Button")
	public void user_clicks_button(String string) {
		linkedList.ClickGetStBtn();
	}

	@When("User clicks {string} button")
	public void user_clicks_button1(String string) {
		linkedList.SignBtn();
	}

	@Then("User is on the {string} page")
	public void user_is_on_the_login_page(String string) {
		String loginPageTitle=DriverFactory.getTitle();
		Assert.assertEquals(string, loginPageTitle); 
	}

	@When("User enters Username {string} and Password {string}")
	public void user_enters_username_and_password(String string, String string2) {
		linkedList.Username();
		linkedList.Password();
		
	}

	@When("User clicks on Login button with expected status as {string}")
	public void user_clicks_on_login_button_with_expected_status_as(String string) {
	    linkedList.Loginbtn();
	}

	@Then("User should see the Home page on successful Login with status {string}")
	public void user_should_see_the_home_page_on_successful_login_with_status(String string) {
	Assert.assertEquals(string, linkedList.statusMessage());
	}

	@Given("the user is on the Home page after signing in")
	public void the_user_is_on_the_home_page_after_signing_in() {
		Assert.assertEquals(true, linkedList.isStatusMessage());
	}
//
//	@When("the user clicks the {string} button in the Linked List panel")
//	public void the_user_clicks_the_button_in_the_linked_list_panel(String string) {
//	    linkedList.getStartedBtn();
//	}

//	@When("the user selects {string} from the dropdown menu")
//	public void the_user_selects_from_the_dropdown_menu(String string) {
//	    linkedList.linkList();
//
//	}
//
//	@Then("the user should be directed to the {string} data structure page")
//	public void the_user_should_be_directed_to_the_data_structure_page(String string) {
//	   Assert.assertEquals(string, linkedList.titleLinkedList());
//	}


//
//	@Given("the user is on the Linked List page after signing in")
//	public void the_user_is_on_the_linked_list_page_after_signing_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the {string} button")
//	public void the_user_clicks_the_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to the {string} page")
//	public void the_user_should_be_redirected_to_the_page(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
//

}
