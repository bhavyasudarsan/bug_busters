package dsAlgo_StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import dsAlgo_PageObjects.HomePage;
import dsAlgo_Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_SD {
	private static final Logger logger = LoggerFactory.getLogger(LinkedList_SD.class);
	ConfigReader configReader = new ConfigReader();
	HomePage homePage = new HomePage();;

	@Given("Browser is open")
	public void browser_is_open() {
		configReader.getUrl();
	}

	@When("The user enter  the correct URL for Heroku app")
	public void the_user_enter_the_correct_url_for_heroku_app() {
		configReader.getUrl();

	}

	@Then("The user is at dsAlgo  app with {string} btn.")
	public void the_user_is_at_ds_algo_app_with_btn(String string) {
		Assert.assertEquals(string, homePage.clickStBtnString());
		logger.info("User is at the dsAlgo Portal");
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		configReader.getUrl();

	}

	@When("The user clicks the {string} button at Portal")
	public void the_user_clicks_the_button_at_portal(String string) {
		homePage.clickStBtn();
	}

	@Then("The user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(
			String string, String string2) {
		Assert.assertEquals(string, homePage.registerBtn());
		Assert.assertEquals(string2, homePage.signInBtn());
		logger.info("User is at the Data Structure Introduction Page");
	}

	@Given("The user at the Home")
	public void the_user_at_the_home() {

		configReader.getHomeUrl();
		homePage.clickStBtn();
		logger.info("User is at the Home Page");

	}

	@When("The user clicks the Data Structures dropdown at Home")
	public void the_user_clicks_the_data_structures_dropdown_at_home() {
		homePage.dropDownClick();
	}

	@Then("The  user should able to see {int} options {string} in dropdown menu at Home")
	public void the_user_should_able_to_see_options_in_dropdown_menu_at_home(Integer expectedCount, String optionList) {
		int actualCount = homePage.getDropdownOptionsCount();
		List<String> actualOptionsText = homePage.getDropdownOptionsText();

		List<String> expectedOptions = homePage.getExpectedOptionsList(optionList);

		assertEquals(expectedCount.intValue(), actualCount,
				"The number of dropdown options does not match the expected count");

		for (int i = 0; i < actualOptionsText.size(); i++) {
			String actualOptionText = actualOptionsText.get(i).trim();
			String expectedOptionText = expectedOptions.get(i).trim();
			assertEquals(expectedOptionText, actualOptionText, "Dropdown option mismatch at index " + i);
		}
	}

	@Then("The user should able to see a warning message {string} at Home")
	public void the_user_should_able_to_see_a_warning_message_at_home(String string) {
		Assert.assertEquals(string, homePage.messageDisplayed());
		logger.info("Warning Message appears: " + "You are not logged in");

	}

	@When("The user selects {string} from the drop down without Sign in at Home")
	public void the_user_selects_from_the_drop_down_without_sign_in_at_home(String daraStructures) {
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

	@When("The user clicks {string} buttons of {string} on the homepage without Sign in at Home")
	public void the_user_clicks_buttons_of_on_the_homepage_without_sign_in_at_home(String butName,
			String dataStructureType) {
		switch (dataStructureType) {
		case "Array":
			homePage.clickArrayBtn();
			break;
		case "Data Structures-Introduction":
			homePage.clickDataStructureBtn();
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
