package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import dsAlgo_PageObjects.Stack;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_SD {
	private static final Logger logger = LoggerFactory.getLogger(LinkedList_SD.class);
	ConfigReader configReader = new ConfigReader();


	Stack stack = new Stack();
	String PageName;
	String expectedOutput;

	@Given("User is redirct the Home page for Stack")
	public void user_is_redirct_the_home_page_for_stack() {
		stack.currentURL();
		stack.statusMessage();
	}

	@When("User selects {string} from the {string} for Stack")
	public void user_selects_from_the_for_stack(String string, String string2) {
		stack.dropDownStack();
		stack.dropDownSelectStack();
	}

	@Then("User should be directed to the {string} data structure page for Stack")
	public void user_should_be_directed_to_the_data_structure_page_for_stack(String string) {
		Assert.assertEquals("Stack", stack.titleStack());

	}

	@When("User clicks the Stack button in the Stack panel")
	public void user_clicks_the_stack_button_in_the_stack_panel() {
		stack.clickGetStartedStackBtn();
	}
	
	@Given("The user is in the Stack page for Stack")
	public void the_user_is_in_the_stack_page_for_stack() {
		stack.clickGetStartedStackBtn();
	}

	@When("The user clicks {string} button for Stack")
	public void the_user_clicks_button_for_stack(String string) {
		PageName=string;
		switch(string) {
		case "Operations in Stack": 
			stack.operationLinkBtnClick();
             break;
		case "Implementation":
			stack.linkImplementationClick();
			break;
		case "Applications"	:	
			stack.linkApplicationClick();
			break;
		}
  
	}

	@Then("The user be directed to {string} for Stack")
	public void the_user_be_directed_to_for_stack(String string) {
	   switch(PageName) {
	   case "Operations in Stack":
		   Assert.assertEquals("Operations in Stack", stack.stackPageIdentify());
		   break;
	   case "Implementation":
			Assert.assertEquals("Implementation", stack.implementationPageIdentify());
		   break;
	   case "Applications":
			Assert.assertEquals("Applications", stack.applicationPageIdentify());
		   break;	   
	   }
	}

	@Given("The user is in the {string} page for Stack")
	public void the_stack_user_is_in_the_page(String string) {
		stack.clickGetStartedStackBtn();

		switch (string) {
		case "Operations in Stack":
			stack.operationLinkBtnClick();
			stack.stackPageIdentify();
			break;
		case "Implementation":
			stack.linkImplementationClick();
			stack.implementationPageIdentify();
			break;
		case "Applications":
			stack.linkApplicationClick();
			stack.applicationPageIdentify();
			break;

		}
	}

	@When("The user clicks {string} button in Stack page for Stack")
	public void the_stack_user_clicks_button_in_stack_page(String string) {
		stack.tryHereBtnClick();
	}

	@Then("The user should be redirected to a page having a try Editor with a {string} button to test for Stack")
	public void the_stack_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_button_to_test(String string) {
		Assert.assertEquals(string, stack.runBtnText());
	}

	
	@Given("The user is on the try Editor of {string} for Stack")
	public void the_user_is_on_the_editor_for_stack(String string) {
		stack.clickGetStartedStackBtn();

		switch (string) {
		case "Operations in Stack":
			stack.operationLinkBtnClick();
			break;
		case "Implementation":
			stack.linkImplementationClick();
			break;
		case "Applications":
			stack.linkApplicationClick();
			break;

		}
		stack.tryHereBtnClick();

	}
	
	@When("User clicks the Run Button by entering invalid data from {string} and {int} for Stack")
	public void user_clicks_the_run_button_by_entering_invalid_data_from_and_for_stack(String string, Integer int1) throws IOException {
		List<Object[]> excelValue=ExcelReader.readExcelData(string);
		Object[] code = excelValue.get(int1 - 1);
		String inputCode = (String) code[0];
		System.out.println("inputCode"+inputCode);
		expectedOutput = (String) code[1];
		
		stack.inputEditor(inputCode);
		stack.runBtnClick();

	}
	
	@Then("User should be able to see the error for Stack")
	public void user_should_be_able_to_see_the_error_for_stack() {
		Assert.assertEquals(expectedOutput, stack.alertMessage());

	}
	@When("User clicks the Run Button by entering valid data from {string} and {int} for Stack")
	public void user_clicks_the_run_button_by_entering_valid_data_from_and_for_stack(String string, Integer int1) throws IOException {
		List<Object[]> excelValue=ExcelReader.readExcelData(string);
		Object[] code = excelValue.get(int1 - 1);
		String inputCode = (String) code[0];
		expectedOutput = (String) code[1];
		
		stack.inputEditor(inputCode);
		stack.runBtnClick();

	}

	
	@Then("User should be able to see the output for Stack")
	public void user_should_be_able_to_see_the_output_for_stack() {
		Assert.assertEquals(expectedOutput, stack.console());

	}
	

}