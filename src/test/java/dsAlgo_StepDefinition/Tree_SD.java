package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Tree_PF;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_SD {
	
	WebDriver driver; 
	Tree_PF tree;
	
	@Given("Tree user is in login page")
	public void tree_user_is_in_login_page() {
		driver=DriverFactory.initiateDriver();
		DriverFactory.openApp();
		tree =  new Tree_PF(driver); 
		tree.getStart(driver);
		tree.signIn();
	}

	@When("Tree user enters Username as {string} and Password as {string}")
	public void tree_user_enters_username_as_and_password_as(String username, String password) {
		System.out.println("User Name: "+ username);
		System.out.println("Password: "+ password);
		
		tree.enterCredentials(username, password);
	}

	@When("Tree user clicks on Login button")
	public void tree_user_clicks_on_login_button() {
		 tree.clickLogin();
	}

	@Then("Tree user should see the Home page on successful login status {string}")
	public void tree_user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		Assert.assertEquals(tree.getStatus(), expectedStatus);
	    System.out.println("Login passed");
	}

	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
		 tree.treeGetStarted(driver);
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
	
	@Given("The user is in the Overview of Trees page")
	public void the_user_is_in_the_overview_of_trees_page() {
	    tree.treeGetStarted(driver);
	    tree.overviewOfTrees(driver);
	}

	@When("The user clicks Try here button in Overview of Trees page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_page() {
	    tree.overviewOfTreesTryHere(driver);
	}

	@Then("The user should be redirected to the try Editor page with a Run button to test")
	public void the_user_should_be_redirected_to_the_try_editor_page_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	
	@After
	public void closeDriver() {
		DriverFactory.tearDown();
	}
}