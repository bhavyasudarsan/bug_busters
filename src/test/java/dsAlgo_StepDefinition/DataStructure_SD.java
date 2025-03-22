package dsAlgo_StepDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import dsAlgo_PageObjects.DataStructure_PF;
import dsAlgo_Utilities.ExcelReader;

public class DataStructure_SD {
	
	DataStructure_PF data_strcture_PF = new DataStructure_PF();
	private static final Logger logger = LoggerFactory.getLogger(DataStructure_SD.class);
	
	String expectedResult;
	String inputText;
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in()  {
		
		logger.info("You are on the Home page");
	}
	
	@When("The user clicks the Get Started button in Data Structure Page")
	public void the_user_clicks_the_get_started_button_in_data_structure_page(){
	
		data_strcture_PF.data_structureGetSatrted();	
	}
	
	@Then("The user be directed to {string} Page")
	public void the_user_be_directed_to_page(String string) {
	 
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		logger.info("You are on the Data Structure page");
	}
	
	@Given("The user is in the Data Structures page")
	public void the_user_is_in_the_data_structures_page() {
		
		data_strcture_PF.data_structureGetSatrted(); 
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		
		data_strcture_PF.timeComplexity(); 
	}
	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		logger.info("You are on the"+ string +"page");
	}
	
	@Given("The user is in the Time Complexity page of data structure")
	public void the_user_is_in_the_time_complexity_page_of_data_structure() {
		
		data_strcture_PF.data_structureGetSatrted(); 
		data_strcture_PF.timeComplexity(); 
	}
	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		
		data_strcture_PF.practiceQuestion();   
	}
	@Then("The user should see the redirected to {string} page")
	public void the_user_should_see_the_redirected_to_page(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		logger.info("You are on the"+ string +"page");
	}
	
	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page()  {
		
		data_strcture_PF.data_structureGetSatrted();  
		data_strcture_PF.timeComplexity(); 
	}
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		
		data_strcture_PF.timeComplexityTryhere(); 
	}
	@Then("The user should be redirected to a page having an {string} with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_run_button_to_test(String string) {
		
		Assert.assertEquals(data_strcture_PF.getTitle(), string);
		logger.info("You are on the"+ string +"page");
	}
	
	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		
		data_strcture_PF.data_structureGetSatrted();  
		data_strcture_PF.timeComplexity(); 
		data_strcture_PF.timeComplexityTryhere();
	}
	
	@When("The user clicks the Run button by entering invalid code from {string} and {int} for tryEditor page")
	public void the_user_clicks_the_run_button_by_entering_invalid_code_from_and_for_try_editor_page(String SheetName, Integer RowNo) throws IOException {
	   
		List<Object[]> registerData = ExcelReader.readExcelData(SheetName);
	     if (RowNo <= registerData.size()) 
	     {
	    	    Object[] row = registerData.get(RowNo-1); // Access the desired row directly
	    	    inputText = (String) row[0];
	    	    expectedResult = (String) row[1];  
	    	    
	    	    data_strcture_PF.inputEditor(inputText);
	            data_strcture_PF.runBtnClick();
	     }  
	}

	@Then("The user should able to see an error message in alert window for tryEditor page")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_try_editor_page() {
	 
		Assert.assertEquals(expectedResult,data_strcture_PF.alertMessage());
		logger.info(expectedResult);
	}

	@When("The user clicks the Run button by entering valid code from {string} and {int} for tryEditor page")
	public void the_user_clicks_the_run_button_by_entering_valid_code_from_and_for_try_editor_page(String SheetName, Integer RowNo) throws IOException {
	   
		List<Object[]> registerData = ExcelReader.readExcelData(SheetName);
	     if (RowNo <= registerData.size()) 
	     {
	    	    Object[] row = registerData.get(RowNo-1); // Access the desired row directly
	    	    inputText = (String) row[0];
	    	    expectedResult = (String) row[1];  
	    	    data_strcture_PF.inputEditor(inputText);
	            data_strcture_PF.runBtnClick();
	     } 
	}

	@Then("The user should able to see output in the console for tryEditor page")
	public void the_user_should_able_to_see_output_in_the_console_for_try_editor_page() {
	  
		Assert.assertEquals(expectedResult,data_strcture_PF.console());	
		logger.info(expectedResult);
	}
}
