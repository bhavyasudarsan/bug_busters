package dsAlgo_StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Tree_PF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_SD {
	
	WebDriver driver; 
	Tree_PF tree;

	@Given("user launches the dsAlgo application")
	public void user_launches_the_ds_algo_application() {
	  driver=DriverFactory.initiateDriver();
	  DriverFactory.openApp();
	   tree =  new Tree_PF(driver); 
	}

	@When("user click get started button")
	public void user_click_get_started_button() {
		
	   tree.getStart(driver);
	}

	@When("user click sign in button")
	public void user_click_sign_in_button() {
		tree.signIn();
	   
	}

	@Then("user is in login page")
	public void user_is_in_login_page() {
	  System.out.println("title:: "+driver.getTitle());
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
		System.out.println("User Name: "+ username);
		System.out.println("Password: "+ password);
		
		tree.enterCredentials(username, password);
	  
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button_with_expected_status_as() {
	    tree.clickLogin();
	}

	@Then("User should see the Home page on successful login status {string}")
	public void user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		Assert.assertEquals(tree.getStatus(), expectedStatus);
	    System.out.println("Login passed");
	}

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		
	   System.out.println("User is in Home Page");
	   
	}

	@When("The user clicks the Get Started button in Tree Panel")
	public void the_user_clicks_the_get_started_button_in_tree_panel() {
	  tree.treeGetStrated(driver);
	}

	@Then("The user be redirected to the Tree Data Structure Page")
	public void the_user_be_redirected_to_the_tree_data_structure_page() {
	  Assert.assertEquals(driver.getTitle(), "Tree");
	}

	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
		 tree.treeGetStrated(driver);
		System.out.println("User is in Tree page");
	}

	@When("The user clicks the Overview of Trees button")
	public void the_user_clicks_the_overview_of_trees_button() {
		tree.overviewOfTrees(driver);
	}

	@Then("The user be redirected to the Overview of Trees Page")
	public void the_user_be_redirected_to_the_overview_of_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Overview of Trees");
	}
	
	@After
	public void closeDriver() {
		DriverFactory.tearDown();
	}
}
