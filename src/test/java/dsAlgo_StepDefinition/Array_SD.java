package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.Array_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_SD {
	
	WebDriver driver;
	Array_PF array ;
	
	
	@Given("Array user is in login page")
	public void array_user_launches_the_ds_algo_application() {
		   driver=DriverFactory.initiateDriver();
		   DriverFactory.openApp();
		   array =  new Array_PF(driver); 
		   array.getStart(driver);
		   array.signIn();
	}

	@When("Array User enters Username as {string} and Password as {string}")
	public void array_user_enters_username_as_and_password_as(String username, String password) {
		array.enterCredentials(username, password);
	}

	@When("Array User clicks on Login button")
	public void array_user_clicks_on_login_button() {
		array.clickLogin();
	}

	@Then("Array User should see the Home page on successful login status {string}")
	public void array_user_should_see_the_home_page_on_successful_login_status(String expectedStatus) {
		Assert.assertEquals(array.getStatus(), expectedStatus);
	    System.out.println("Login passed");
	}
	

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		array.arrayGetStarted(driver);
			System.out.println(driver.getTitle());
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	   array.arraysInPython(driver);
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Arrays in Python");
	}
	
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
	    array.arrayGetStarted(driver);
	    array.arraysInPython(driver);
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    array.tryHere(driver);
	}

	@Then("The Array user should be redirected to a page having an try Editor with a Run button to test")
	public void the_array_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	
	@Given("The user is in the tryEditor page for Arrays in Python page")
	public void the_user_is_in_the_try_editor_page_for_arrays_in_python_page() {
		the_user_is_on_the_arrays_in_python_page();
		array.tryHere(driver);
	}
	@When("The Array user clicks the Run without entering the code in the Editor")
	public void the_array_user_clicks_the_run_without_entering_the_code_in_the_editor() {
	   array.run();
	}
	
	@Then("The Array user should able to see an error message in alert window")
	public void the_array_user_should_able_to_see_an_error_message_in_alert_window() {
		String alertText= array.alertMessage(driver);
		Assert.assertNotNull(alertText);
	}
	
	@When("The Array user write the invalid code in Editor and click the Run")
	public void the_array_user_write_the_invalid_code_in_editor_and_click_the_run() {
	    array.invalidPythonCode(driver);
	}
	
	@When("The Array user write the valid code in Editor and click the Run")
	public void the_array_user_write_the_valid_code_in_editor_and_click_the_run() {
	    array.validPythonCode(driver);
	}
	@Then("The Array user should able to see output in the console")
	public void the_array_user_should_able_to_see_output_in_the_console() {
		Assert.assertNotNull(array.output(driver));
	}
	
	@When("The user clicks Practice Questions button from Arrays in Python page")
	public void the_user_clicks_practice_questions_button_from_arrays_in_python_page() {
	    array.arraysInPython(driver);
	    array.practiceQuestions(driver);
	}
	@Then("The user should be redirected to Practice page from Arrays in Python page")
	public void the_user_should_be_redirected_to_practice_page_from_arrays_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}
	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		array.practiceQuestions(driver);
		array.searchTheArray();

	}
	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
		Assert.assertEquals(driver.getTitle(), "Assessment");

	}
	@Given("The user is on the practice question editor from Search the array")
	public void the_user_is_on_the_practice_question_editor_from_search_the_array() { 
		array.arrayGetStarted(driver);
		the_user_clicks_practice_questions_button_from_arrays_in_python_page();
		array.searchTheArray();
	}
		
	@When("The user write the invalid code for Search the array in Editor and Click the Run")
	public void the_user_write_the_invalid_code_for_search_the_array_in_editor_and_click_the_run() {
	   array.invalidPythonCode(driver);
	}
	@Then("The user should able to see an error message in alert window for Search the array")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_search_the_array() {
		String alertText= array.alertMessage(driver);
		Assert.assertNotNull(alertText);
	}
	@When("The user write the valid code for Search the array in Editor and Click the Run")
	public void the_user_write_the_valid_code_for_search_the_array_in_editor_and_click_the_run() {
	    array.validCodeSearchtheArray(driver);
	    array.run();
	}
	@Then("The user should able to see output in the console for Search the array")
	public void the_user_should_able_to_see_output_in_the_console_for_search_the_array() {
	    Assert.assertEquals(array.output(driver), "Element Not Found");
	}
	@When("The user write the invalid code for Search the array in Editor and Click the Submit")
	public void the_user_write_the_invalid_code_for_search_the_array_in_editor_and_click_the_submit() {
	    array.invalidCodeSubmit(driver);
	}
	@Then("The user see an error message {string} for Search the array")
	public void the_user_see_an_error_message_for_search_the_array(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user write the valid code for Search the array in Editor and Click the Submit")
	public void the_user_write_the_valid_code_for_search_the_array_in_editor_and_click_the_submit() {
	    array.validCodeSearchtheArray(driver);
	    array.submit();
	}
	@Then("The user see success message {string} for Search the array")
	public void the_user_see_success_message_for_search_the_array(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
	    array.practiceQuestions(driver);
	    array.maxConsecutiveOnes();
	}
	
	@Given("The user is on the practice question editor from Max Consecutive Ones question")
	public void the_user_is_on_the_practice_question_editor_from_max_consecutive_ones_question() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_max_consecutive_ones_link();
	}

	@When("The user write the invalid code for Max Consecutive Ones in Editor and Click the Run")
	public void the_user_write_the_invalid_code_for_max_consecutive_ones_in_editor_and_click_the_run() {
	   array.invalidPythonCode(driver);
	}
	@Then("The user should able to see an error message in alert window for Max Consecutive Ones")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_max_consecutive_ones() {
		String alertText= array.alertMessage(driver);
		Assert.assertNotNull(alertText);
	}
	@When("The user write the valid code for Max Consecutive Ones in Editor and Click the Run")
	public void the_user_write_the_valid_code_for_max_consecutive_ones_in_editor_and_click_the_run() {
	    array.validCodeMaxConsecutiveOnes(driver);
	    array.run();
	}
	@Then("The user should able to see output in the console for Max Consecutive Ones")
	public void the_user_should_able_to_see_output_in_the_console_for_max_consecutive_ones() {
		Assert.assertEquals(array.output(driver),"3");
	}
	@When("The user write the invalid code for Max Consecutive in Editor and Click the Submit")
	public void the_user_write_the_invalid_code_for_max_consecutive_in_editor_and_click_the_submit() {
	    array.invalidCodeSubmit(driver);
	}
	@Then("The user see an error message {string} for Max Consecutive")
	public void the_user_see_an_error_message_for_max_consecutive(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user write the valid code for Max Consecutive in Editor and Click the Submit")
	public void the_user_write_the_valid_code_for_max_consecutive_in_editor_and_click_the_submit() {
	    array.validCodeMaxConsecutiveOnes(driver);
	    array.submit();
	}
	@Then("The user see success message {string} for Max Consecutive")
	public void the_user_see_success_message_for_max_consecutive(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	
	@When("The user clicks the FindNumbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		 array.practiceQuestions(driver);
		 array.findNumberswithEvenNumberofDigits();
	}
	@Given("The user is on the practice question editor from FindNumbers with Even Number of Digits")
	public void the_user_is_on_the_practice_question_editor_from_find_numbers_with_even_number_of_digits() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_find_numbers_with_even_number_of_digits_link();
	}
	@When("The user write the invalid code for Find Numbers with Even Number of Digits in Editor and Click the Run")
	public void the_user_write_the_invalid_code_for_find_numbers_with_even_number_of_digits_in_editor_and_click_the_run() {
	    array.invalidPythonCode(driver);
	}
	@Then("The user should able to see an error message in alert window for Find Numbers with Even Number of Digits")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_find_numbers_with_even_number_of_digits() {
		String alertText= array.alertMessage(driver);
		Assert.assertNotNull(alertText);
	}
	@When("The user write the valid code for Find Numbers with Even Number of Digits in Editor and Click the Run")
	public void the_user_write_the_valid_code_for_find_numbers_with_even_number_of_digits_in_editor_and_click_the_run() {
	   array.validCodeEvenNumberofDigits(driver);
	   array.run();
	}
	@Then("The user should able to see output in the console for Find Numbers with Even Number of Digits")
	public void the_user_should_able_to_see_output_in_the_console_for_find_numbers_with_even_number_of_digits() {
		Assert.assertEquals(array.output(driver),"3");
	}
	@When("The user write the invalid code for Find Numbers with Even Number of Digits in Editor and Click the Submit")
	public void the_user_write_the_invalid_code_for_find_numbers_with_even_number_of_digits_in_editor_and_click_the_submit() {
	    array.invalidCodeSubmit(driver);
	}
	@Then("The user see an error message {string} for Find Numbers with Even Number of Digits")
	public void the_user_see_an_error_message_for_find_numbers_with_even_number_of_digits(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user write the valid code for Find Numbers with Even Number of Digits in Editor and Click the Submit")
	public void the_user_write_the_valid_code_for_find_numbers_with_even_number_of_digits_in_editor_and_click_the_submit() {
	    array.validCodeEvenNumberofDigits(driver);
	    array.submit();
	}
	@Then("The user see success message {string} for Find Numbers with Even Number of Digits")
	public void the_user_see_success_message_for_find_numbers_with_even_number_of_digits(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	   array.practiceQuestions(driver);
	   array.squaresOfaSortedArray();
	}
	@Given("The user is on the practice question editor from Squares of a Sorted Array")
	public void the_user_is_on_the_practice_question_editor_from_squares_of_a_sorted_array() {
		the_user_is_on_the_arrays_in_python_page();
		the_user_clicks_the_squares_of_a_sorted_array_link();
	}
	@When("The user write the invalid code for Squares of a Sorted Array in Editor and Click the Run")
	public void the_user_write_the_invalid_code_for_squares_of_a_sorted_array_in_editor_and_click_the_run() {
	    array.invalidPythonCode(driver);
	}
	@Then("The user should able to see an error message in alert window for Squares of a Sorted Array")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_squares_of_a_sorted_array() {
		String alertText= array.alertMessage(driver);
		Assert.assertNotNull(alertText);
	}
	@When("The user write the valid code for Squares of a Sorted Array in Editor and Click the Run")
	public void the_user_write_the_valid_code_for_squares_of_a_sorted_array_in_editor_and_click_the_run() {
	   array.validCodeSquaresOfaSortedArray(driver);
	   array.run();
	}
	@Then("The user should able to see output in the console for Squares of a Sorted Array")
	public void the_user_should_able_to_see_output_in_the_console_for_squares_of_a_sorted_array() {
		Assert.assertEquals(array.output(driver),"[0, 1, 9, 16, 100]");
	}
	@When("The user write the invalid code for Squares of a Sorted Array in Editor and Click the Submit")
	public void the_user_write_the_invalid_code_for_squares_of_a_sorted_array_in_editor_and_click_the_submit() {
	    array.invalidCodeSubmit(driver);
	}
	@Then("The user see an error message {string} for Squares of a Sorted Array")
	public void the_user_see_an_error_message_for_squares_of_a_sorted_array(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user write the valid code for Squares of a Sorted Array in Editor and Click the Submit")
	public void the_user_write_the_valid_code_for_squares_of_a_sorted_array_in_editor_and_click_the_submit() {
	    array.validCodeSquaresOfaSortedArray(driver);
	    array.submit();
	}
	@Then("The user see success message {string} for Squares of a Sorted Array")
	public void the_user_see_success_message_for_squares_of_a_sorted_array(String string) {
		Assert.assertEquals(array.output(driver),string);
	}
	@When("The user clicks the Arrays Using List button")
	public void the_user_clicks_the_arrays_using_list_button() {
	   array.arraysUsingList(driver);
	}
	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		Assert.assertEquals(driver.getTitle(), "Arrays Using List");
	}
	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    array.arrayGetStarted(driver);
	    array.arraysUsingList(driver);
	}
	@When("The user clicks Try Here button in Arrays Using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	    array.tryHere(driver);
	}
	@Given("The user is in the tryEditor page from Arrays Using List page")
	public void the_user_is_in_the_try_editor_page_from_arrays_using_list_page() {
		the_user_is_on_the_arrays_using_list_page();
		array.tryHere(driver);
	}
	@When("The user clicks the Basic Operations in Lists button")
	public void the_user_clicks_the_basic_operations_in_lists_button() {
	    array.basicOperationsinLists(driver);
	}
	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		Assert.assertEquals(driver.getTitle(), "Basic Operations in Lists");
	}
	@Given("The user is in Basic Operations in Lists page")
	public void the_user_is_in_basic_operations_in_lists_page() {
	    array.arrayGetStarted(driver);
	    array.basicOperationsinLists(driver);
	}
	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	   array.tryHere(driver);
	}
	@Given("The user is in the tryEditor page from Basic Operations in Lists")
	public void the_user_is_in_the_try_editor_page_from_basic_operations_in_lists() {
		the_user_is_in_basic_operations_in_lists_page();
		array.tryHere(driver);
	}
	@When("The user clicks the Applications of Array button")
	public void the_user_clicks_the_applications_of_array_button() {
	    array.applicationsofArray(driver);
	}
	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		Assert.assertEquals(driver.getTitle(), "Applications of Array");
	}
	@Given("The user is in Applications of Array page")
	public void the_user_is_in_applications_of_array_page() {
	    array.arrayGetStarted(driver);
	    array.applicationsofArray(driver);
	}
	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	    array.tryHere(driver);
	}
	@Given("The user is in the tryEditor page from Applications of Array")
	public void the_user_is_in_the_try_editor_page_from_applications_of_array() {
		the_user_is_in_applications_of_array_page();
		array.tryHere(driver);
	}
}
