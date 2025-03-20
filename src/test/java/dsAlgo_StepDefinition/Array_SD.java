package dsAlgo_StepDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import dsAlgo_PageObjects.Array_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_SD {
	
	Array_PF array = new Array_PF();
	private static final Logger logger = LoggerFactory.getLogger(Array_SD.class);

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
			array.arrayGetStarted();
			logger.info("Array page started");
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	   array.arraysInPython();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals(array.getTitle(), "Arrays in Python");
	}
	
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
	    array.arrayGetStarted();
	    array.arraysInPython();
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    array.tryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test for Array")
	public void the_array_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Assert.assertEquals(array.getTitle(), "Assessment");
	}
	
	@Given("The user is in the tryEditor page for Arrays in Python page")
	public void the_user_is_in_the_try_editor_page_for_arrays_in_python_page() {
		the_user_is_on_the_arrays_in_python_page();
		array.tryHere();
	}
	
	@When("The user writes invalid code from {string} and {int} and clicks the Run in the Editor for Array")
	public void the_user_writes_invalid_code_from_and_and_clicks_the_run_in_the_editor_for_array(String sheetname, Integer row) {
	    array.invalidPythonCode(sheetname, row);
	}
	@Then("The user see an error message in alert window as per {string} and {int} for Array")
	public void the_user_see_an_error_message_in_alert_window_as_per_and_for_array(String sheetname, Integer row) {
		Assert.assertEquals(array.alertMessage(),array.expectedOutputFromExcel(sheetname,row));
	}
	@When("The user write the valid code from {string} and {int} and clicks the Run in the Editor for Array")
	public void the_user_write_the_valid_code_from_and_and_clicks_the_run_in_the_editor_for_array(String sheetname, Integer row) {
		array.validPythonCode(sheetname,row);
	}
	@Then("The user should able to see output in the console as per {string} and {int} for Array")
	public void the_user_should_able_to_see_output_in_the_console_as_per_and_for_array(String sheetname, Integer row) {
		Assert.assertEquals(array.output(), array.expectedOutputFromExcel(sheetname,row));
	}
	
	@When("The user clicks Practice Questions button from Arrays in Python page")
	public void the_user_clicks_practice_questions_button_from_arrays_in_python_page() {
	    array.arraysInPython();
	    array.practiceQuestions();
	}
	@Then("The user should be redirected to Practice page from Arrays in Python page")
	public void the_user_should_be_redirected_to_practice_page_from_arrays_in_python_page() {
		Assert.assertEquals(array.getTitle(), "Practice Questions");
	}
	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		array.practiceQuestions();
		array.searchTheArray();

	}
	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
		Assert.assertEquals(array.getTitle(), "Assessment");

	}
	@Given("The user is on the practice question editor from Search the array")
	public void the_user_is_on_the_practice_question_editor_from_search_the_array() { 
		array.arrayGetStarted();
		the_user_clicks_practice_questions_button_from_arrays_in_python_page();
		array.searchTheArray();
	}
	@When("The user write the invalid code from {string} and {int} for practice question and Click the Run")
	public void the_user_write_the_invalid_code_from_and_for_practice_question_and_click_the_run(String sheetname, Integer row) {
		array.invalidPythonCode(sheetname,row);
	}
	@Then("The user should able to see an error message as per {string} and {int} in alert window for practice question")
	public void the_user_should_able_to_see_an_error_message_as_per_and_in_alert_window_for_practice_question(String sheetname, Integer row) {

		String alertText= array.alertMessage();
		Assert.assertEquals(alertText,array.expectedOutputFromExcel(sheetname,row) );
	}
	
	@When("The user write the valid code from {string} and {int} for practice question and Click the Run")
	public void the_user_write_the_valid_code_from_and_for_practice_question_and_click_the_run(String sheetname, Integer row) {
		array.validCodePracticeQuestions(sheetname,row);
	    array.run();
	}
	@Then("The user should able to see output in the console as per {string} and {int} for practice question")
	public void the_user_should_able_to_see_output_in_the_console_as_per_and_for_practice_question(String sheetname, Integer row) {
		 Assert.assertEquals(array.output(),array.expectedOutputFromExcel(sheetname,row));
	}
	@When("The user write the invalid code from {string} and {int} for practice question and Click the Submit")
	public void the_user_write_the_invalid_code_from_and_for_practice_question_and_click_the_submit(String sheetname, Integer row) {
		 array.invalidCodeSubmit(sheetname,row);
	}
	@Then("The user should able to see an error message as per {string} and {int} in console for practice question")
	public void the_user_should_able_to_see_an_error_message_as_per_and_in_console_for_practice_question(String sheetname, Integer row) {
		Assert.assertEquals(array.output(),array.expectedOutputFromExcel(sheetname,row));
	}
	@When("The user write the valid code from {string} and {int} for practice question and Click the Submit")
	public void the_user_write_the_valid_code_from_and_for_practice_question_and_click_the_submit(String sheetname, Integer row) {
		array.validCodePracticeQuestions(sheetname,row);
	    array.submit();
	}
	
	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
	    array.practiceQuestions();
	    array.maxConsecutiveOnes();
	}
	
	@Given("The user is on the practice question editor from Max Consecutive Ones question")
	public void the_user_is_on_the_practice_question_editor_from_max_consecutive_ones_question() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_max_consecutive_ones_link();
	}

	@Then("The user should able to see output in console as per {string} and {int} for practice question")
	public void the_user_should_able_to_see_output_in_console_as_per_and_for_practice_question(String sheetname, Integer row) {
		Double actual=Double.parseDouble(array.output());
		Double expected=Double.parseDouble(array.expectedOutputFromExcel(sheetname,row));
		Assert.assertEquals(actual,expected);
	}
	
	@When("The user clicks the FindNumbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		 array.practiceQuestions();
		 array.findNumberswithEvenNumberofDigits();
	}
	@Given("The user is on the practice question editor from FindNumbers with Even Number of Digits")
	public void the_user_is_on_the_practice_question_editor_from_find_numbers_with_even_number_of_digits() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_find_numbers_with_even_number_of_digits_link();
	}
	
	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	   array.practiceQuestions();
	   array.squaresOfaSortedArray();
	}
	@Given("The user is on the practice question editor from Squares of a Sorted Array")
	public void the_user_is_on_the_practice_question_editor_from_squares_of_a_sorted_array() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_squares_of_a_sorted_array_link();
	}
	
	@When("The user clicks the Arrays Using List button")
	public void the_user_clicks_the_arrays_using_list_button() {
	   array.arraysUsingList();
	}
	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		Assert.assertEquals(array.getTitle(), "Arrays Using List");
	}
	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    array.arrayGetStarted();
	    array.arraysUsingList();
	}
	@When("The user clicks Try Here button in Arrays Using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	    array.tryHere();
	}
	@Given("The user is in the tryEditor page from Arrays Using List page")
	public void the_user_is_in_the_try_editor_page_from_arrays_using_list_page() {
		the_user_is_on_the_arrays_using_list_page();
		array.tryHere();
	}
	@When("The user clicks the Basic Operations in Lists button")
	public void the_user_clicks_the_basic_operations_in_lists_button() {
	    array.basicOperationsinLists();
	}
	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		Assert.assertEquals(array.getTitle(), "Basic Operations in Lists");
	}
	@Given("The user is in Basic Operations in Lists page")
	public void the_user_is_in_basic_operations_in_lists_page() {
	    array.arrayGetStarted();
	    array.basicOperationsinLists();
	}
	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	   array.tryHere();
	}
	@Given("The user is in the tryEditor page from Basic Operations in Lists")
	public void the_user_is_in_the_try_editor_page_from_basic_operations_in_lists() {
		the_user_is_in_basic_operations_in_lists_page();
		array.tryHere();
	}
	@When("The user clicks the Applications of Array button")
	public void the_user_clicks_the_applications_of_array_button() {
	    array.applicationsofArray();
	}
	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		Assert.assertEquals(array.getTitle(), "Applications of Array");
	}
	@Given("The user is in Applications of Array page")
	public void the_user_is_in_applications_of_array_page() {
	    array.arrayGetStarted();
	    array.applicationsofArray();
	}
	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	    array.tryHere();
	}
	@Given("The user is in the tryEditor page from Applications of Array")
	public void the_user_is_in_the_try_editor_page_from_applications_of_array() {
		the_user_is_in_applications_of_array_page();
		array.tryHere();
	}
}