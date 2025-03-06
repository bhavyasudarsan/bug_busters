package dsAlgo_StepDefinition;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Home_SD {

	HomePage homePage;
	WebDriver driver;

	public Home_SD() {
		System.out.println("******Home_SD ");
		driver = DriverFactory.initiateDriver();
		homePage = new HomePage(driver);
	}

	@Given("Browser is open")
	public void browser_is_open() {
		if (driver == null)
			driver = DriverFactory.initiateDriver();
		driver.get("https://dsportalapp.herokuapp.com");
	}

	@When("Home user enter  the correct URL for Heroku app")
	public void the_user_enter_the_correct_url_for_heroku_app() {
		driver.getCurrentUrl();

	}

	@Then("Home User is at dsAlgo  app with {string} btn.")
	public void user_is_at_ds_algo_app_with_get_start_button(String string) {
		Assert.assertEquals(string, homePage.clickStBtnString());

	}

	@Given("The Homepage user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		driver.getCurrentUrl();
	}

	@When("The Homepage user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		homePage.clickStBtn();
	}

	@Then("The Homepage user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(
			String string, String string2) {
		Assert.assertEquals(string, homePage.registerBtn());
		Assert.assertEquals(string2, homePage.signInBtn());
		System.out.println("User is in the data structure Introduction page");
	}

	@Given("The Homepage user is on the Homepage")
	public void the_user_is_on_the_homepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("The Homepage user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
		homePage.dropDownClick();
	}

	@Then("The Homepage user should able to see {int} options {string} in dropdown menu")
	public void the_user_should_able_to_see_options_in_dropdown_menu(Integer expectedCount, String optionList) {

		int actualCount = homePage.getDropdownOptionsCount();
		List<String> actualOptionsText = homePage.getDropdownOptionsText();

		// Get the expected options list from the step argument
		List<String> expectedOptions = homePage.getExpectedOptionsList(optionList);

		// Assertion: Check if the actual count of options matches the expected count
		assertEquals("The number of dropdown options does not match the expected count", expectedCount.intValue(),
				actualCount);

		// Assertion: Check if the actual options match the expected options
		for (int i = 0; i < actualOptionsText.size(); i++) {
			String actualOptionText = actualOptionsText.get(i).trim();
			String expectedOptionText = expectedOptions.get(i).trim();
			assertEquals(expectedOptionText, actualOptionText, "Dropdown option mismatch at index " + i);
		}
	}

	@When("The user selects {string} from the drop down without Sign in.")
	public void the_user_selects_from_the_drop_down_without_sign_in(String daraStructures) {
		homePage.dropDownClick();
		switch (daraStructures) {
		case "Arrays":
			homePage.arrayClick();
			break;
		case "Linked List":
			homePage.linkedListClick();
			break;

		case "Stack":
			homePage.stackClick();
			break;
		case "Queue":
			homePage.queueClick();
			break;
		case "Graph":
			homePage.graphClick();
			break;
		case "Tree":
			homePage.treeClick();
			break;
		default:
			break;
		}
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
		homePage.messageDisplayed();
	}

	@Given("The user at the Homepage")
	public void the_user_at_the_homepage() {
		homePage.home();
	}

	@When("The user clicks {string} buttons of {string} on the homepage without Sign in")
	public void the_user_clicks_buttons_of_on_the_homepage_without_sign_in(String butName, String dataStructureType) {
		switch (dataStructureType) {
		case "Array":
			homePage.clickArrayBtn();

			break;
		case "Data Structures-Introduction":
			homePage.clickDataSttructureBtn();

			break;

		case "Stack":
			homePage.clickStackBtn();
			break;
		case "Queue":
			homePage.clickQueueBtn();
			break;
		case "Tree":
			homePage.clickTreeBtn();
			break;
		case "Linked List":
			homePage.clickGraphBtn();
			break;
		default:
			break;
		}

	}

}
