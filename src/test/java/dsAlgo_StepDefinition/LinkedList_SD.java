package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import dsAlgo_PageObjects.LinkedList;
import dsAlgo_Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_SD {

	private static final Logger logger = LoggerFactory.getLogger(LinkedList_SD.class);

	LinkedList linkedList = new LinkedList();

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

	@Given("LinkedUser is on the Home page after signing in")
	public void the_user_is_on_the_home_page_after_signing_in() {
		linkedList.openHomeScreen();
	}

	@Given("LinkedUser is redirct the Home page")
	public void the_user_is_on_the_home_page() {
		linkedList.openHomeScreen();
	}

	@When("LinkedUser clicks the {string} button in the Linked List panel")
	public void the_user_clicks_the_button_in_the_linked_list_panel(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		logger.info("User is in the Linked List page");
	}

	@When("LinkedUser selects {string} from the dropdown menu")
	public void the_user_selects_from_the_dropdown_menu(String string) {

		linkedList.dropdownMenuClick();
		linkedList.clickLinkedListFromDropdown();
	}

	@Then("LinkedUser  should be directed to the {string} data structure page")
	public void the_user_should_be_directed_to_the_data_structure_page(String string) {
		Assert.assertEquals(string, linkedList.titleLinkedList());
	}

	@Given("LinkedUser is on the Linked List page after signing in")
	public void the_user_is_on_the_linked_list_page_after_signing_in() {
		linkedList.clcikGetStartedLinkedListBtn();
	}

	@When("LinkedUser clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		linkedList.clickIntrodcution();
	}

	@Then("LinkedUser should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		linkedList.currentURL();
	}

	@Given("LinkedUser is on {string} page")
	public void user_is_on_page(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.clickIntrodcution();
	}

	@When("LinkedUser clicks {string} button in {string} page")
	public void user_clicks_button_in_page(String string, String string2) {
		linkedList.tryHereBtnClick();
	}

	@Then("The user should be redirected to a page having a try Editor with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_to_test(String string) {
		Assert.assertEquals(string, linkedList.runBtnText());
	}

	@Given("LinkedUser is on the {string} page")
	public void linked_user_is_on_the_page(String string) {
		linkedList.clcikGetStartedLinkedListBtn();
		linkedList.clickIntrodcution();
		linkedList.tryHereBtnClick();
		linkedList.tryEditorPage();
	}

	@When("LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet {string}")
	public void linked_user_clicks_the_run_button_without_entering_the_code_in_the_editor_from_excel_test_data_xlsx_sheet(
			String Editor) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(Editor);
		Object[] code = input.get(3);
		String invalidCode = (String) code[0];
		System.out.println("emptycode" + invalidCode);
		linkedList.inputEditor(invalidCode);
		linkedList.runBtnClick();
	}

	@Then("LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet {string}")
	public void linked_user_should_able_to_see_error_message_in_alert_window_without_entering_value_from_excel_test_data_xlsx_sheet(
			String Editor) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(Editor);
		Object[] code = input.get(3);
		String expectedAlertMessage = (String) code[1];
		System.out.println("expectedAlertMessage" + expectedAlertMessage);
		String test = linkedList.alertMessage();
		Assert.assertEquals(expectedAlertMessage, test);
	}

	@When("LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet {string}")
	public void linked_user_clicks_the_run_button_by_entering_invalid_python_code_in_the_editor_from_excel_sheet(
			String Linkedlist) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(Linkedlist);
		Object[] code = input.get(2);
		String invalidCode = (String) code[0];
		linkedList.inputEditor(invalidCode);
		linkedList.runBtnClick();
	}

	@Then("LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet {string}")
	public void linked_user_should_able_to_see_an_error_message_in_alert_window_by_entering_invalid_python_code_in_the_editor_from_excel_test_data_xlsx_sheet(
			String Editor) throws IOException {
		List<Object[]> input = ExcelReader.readExcelData(Editor);
		Object[] code = input.get(2);
		String expectedAlertMessage = (String) code[1];
		Assert.assertEquals(expectedAlertMessage, linkedList.alertMessage());
	}

	@When("LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet {string}")
	public void linked_user_clicks_the_run_button_by_entering_valid_python_code_in_the_editor_from_excel_sheet(
			String Editor) throws IOException {
		List<Object[]> code = ExcelReader.readExcelData(Editor);
		Object[] validInputRow = code.get(1);
		String validCode = (String) validInputRow[0];
		linkedList.inputEditor(validCode);
		linkedList.runBtnClick();
	}

	@Then("LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet {string}")
	public void linked_user_should_able_to_see_hello_in_the_console_by_entering_valid_python_code_in_the_editor_from_excel_sheet(
			String Editor) throws IOException {
		List<Object[]> console = ExcelReader.readExcelData(Editor);
		Object[] consoleOutput = console.get(1);
		String expectedOutput = (String) consoleOutput[1];
		Assert.assertEquals(expectedOutput, linkedList.console());
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