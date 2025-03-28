package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import dsAlgo_PageObjects.LinkedList;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_SD {

	private static final Logger logger = LoggerFactory.getLogger(LinkedList_SD.class);
	ConfigReader configReader = new ConfigReader();

	LinkedList linkedList = new LinkedList();
	String expectedOutput;
	String pageName;

	@Given("User is in login page")
	public void user_is_in_login_page() {
		linkedList.ClickGetStBtn();
		linkedList.SignBtn();
	}

	@When("User enter username and password from Excel test_data.xlsx sheet {string}")
	public void user_enter_username_and_password_from_excel_test_data_xlsx_sheet(String Login) throws IOException {
		List<Object[]> loginData = ExcelReader.readExcelData(Login);
		Object[] objArray = loginData.get(1);
		String username = (String) objArray[0];
		String password = (String) objArray[1];
		linkedList.username(username);
		linkedList.password(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		linkedList.Loginbtn();
	}

	@Given("User is redirct the Home page for LinkedList")
	public void user_is_redirct_the_home_page_for_linked_list() {
		configReader.getHomeUrl();
	}

	@When("User selects {string} from the {string} for LinkedList")
	public void user_selects_from_the_for_linked_list(String string, String string2) {
		linkedList.dropdownMenuClick();
		linkedList.clickLinkedListFromDropdown();
	}

	@When("User clicks the {string} button in the Linked List panel for LinkedList")
	public void user_clicks_the_button_in_the_linked_list_panel_for_linked_list(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		logger.info("User is in the Linked List page");
	}

	@Then("User  should be directed to the {string} data structure page for LinkedList")
	public void user_should_be_directed_to_the_data_structure_page_for_linked_list(String string) {
		Assert.assertEquals(string, linkedList.titleLinkedList());
		logger.info("User is in the Linked List page");
	}

	@Given("User is on the Linked List page after signing in")
	public void user_is_on_the_linked_list_page_after_signing_in() {
		linkedList.clcikGetStartedLinkedListBtn();

	}

	@When("Userr clicks the {string} button for LinkedList")
	public void userr_clicks_the_button_for_linked_list(String string) {
		pageName = string;
		switch (string) {
		case "Introduction":
			linkedList.clickIntrodcution();
			break;

		case "Creating Linked List":
			linkedList.creatingLinkedListClick();
			break;

		case "Types of Linked List":
			linkedList.typeOfLinkListinkClick();
			break;

		case "Implement Linked List in Python":
			linkedList.implimentLinkedListClick();
			break;

		case "Traversal":
			linkedList.traversalClick();
			break;

		case "Insertion":
			linkedList.insertionClick();

			break;

		case "Deletion":
			linkedList.deletionClick();
		}
	}

	@Then("User should be redirected to the respective page for LinkedList")
	public void user_should_be_redirected_to_the_respective_page_for_linked_list() {
		switch (pageName) {
		case "Introduction":
			linkedList.clickIntrodcution();
			Assert.assertEquals("Introduction", linkedList.getTitleIntroduction());
			break;

		case "Creating Linked List":
			linkedList.creatingLinkedListClick();
			Assert.assertEquals("Creating Linked LIst", linkedList.getTitleCreatingLinkedList());
			break;

		case "Types of Linked List":
			linkedList.typeOfLinkListinkClick();
			Assert.assertEquals("Types of Linked List", linkedList.getTitleTypeOfLinked());

			break;

		case "Implement Linked List in Python":
			linkedList.implimentLinkedListClick();

			Assert.assertEquals("Implement Linked List in Python", linkedList.getTitleImplimentLinked());
			break;

		case "Traversal":
			linkedList.traversalClick();

			Assert.assertEquals("Traversal", linkedList.getTitleTraversal());

			break;

		case "Insertion":

			linkedList.insertionClick();

			Assert.assertEquals("Insertion", linkedList.getTitleInsertionLink());

			break;

		case "Deletion":
			linkedList.deletionClick();

			Assert.assertEquals("Deletion", linkedList.getTitleDeletionLink());
			break;
		}

	}

	@Given("User is on {string} page for LinkedList")
	public void user_is_on_page_for_linked_list(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.clickIntrodcution();
	}

	@When("User clicks Try Here button in {string} page for LinkedList")
	public void user_clicks_button_in_page_for_linked_list(String string) {
		linkedList.tryHereBtnClick();
	}

	@Then("User should be redirected to a page having a try Editor with a {string} button to test for LinkedList")
	public void user_should_be_redirected_to_a_page_having_a_try_editor_with_a_button_to_test_for_linked_list(
			String string) {
		Assert.assertEquals(string, linkedList.runBtnText());
	}

	@Given("User is on the try Editor page for {string} for LinkedList")
	public void user_is_on_the_try_editor_page_for_linked_list(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		switch (string) {
		case "Introduction":
			linkedList.clickIntrodcution();
			break;

		case "Creating Linked List":
			linkedList.creatingLinkedListClick();
			break;

		case "Types of Linked List":
			linkedList.typeOfLinkListinkClick();
			break;

		case "Implement Linked List in Python":
			linkedList.implimentLinkedListClick();
			break;

		case "Traversal":
			linkedList.traversalClick();

			break;

		case "Insertion":
			linkedList.insertionClick();

			break;

		case "Deletion":
			linkedList.deletionClick();
			break;
		}

		linkedList.tryHereBtnClick();
	}

	@When("User clicks the Run Button by entering invalid data from {string} and {int} for LinkedList")
	public void user_clicks_the_run_button_by_entering_invalid_data_from_and_for_linked_list(String sheetName,
			Integer int1) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(sheetName);
		Object[] code = input.get(int1 - 1);
		String inputCode = (String) code[0];
		expectedOutput = (String) code[1];
		linkedList.inputEditor(inputCode);
		linkedList.runBtnClick();
	}

	@Then("User should be able to see the error for LinkedList")
	public void user_should_be_able_to_see_the_error_for_linked_list() throws IOException {
		Assert.assertEquals(expectedOutput, linkedList.alertMessage());
		logger.info("User enter invalid python code");
	}

	@When("User clicks the Run Button by entering valid data from {string} and {int} for LinkedList")
	public void user_clicks_the_run_button_by_entering_valid_data_from_and_for_linked_list(String sheetName,
			Integer int1) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(sheetName);
		Object[] code = input.get(int1 - 1);
		String inputCode = (String) code[0];
		expectedOutput = (String) code[1];
		linkedList.inputEditor(inputCode);
		linkedList.runBtnClick();
	}

	@Then("User should be able to see the result for LinkedList")
	public void user_should_be_able_to_see_the_result_for_linked_list() {
		Assert.assertEquals(expectedOutput, linkedList.console());
		logger.info("User enter valid python code");
	}

}