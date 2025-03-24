package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsAlgo_PageObjects.Queue;
import dsAlgo_Utilities.ExcelReader;

public class Queue_SD{
	private static final Logger logger = LoggerFactory.getLogger(Queue_SD.class);
	public Queue queue_PF;
	String inputText;
	String expectedOutput;
		
	public Queue_SD() { 
        queue_PF = new Queue();
    }
	
	@Given("The user is in the Main page after Sign in for Queue")
	public void the_queue_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("User is in the Main Page");
	}

	@When("The user clicks the {string} button in Queue")
	public void the_user_clicks_the_button_in_queue(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickQueue();
	}

	@Then("The user should land in Queue")
	public void the_user_should_land_in() {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();
		Assert.assertEquals("Queue", msg);
	}

	@Given("The user is in the {string} page for Queue")
	public void the_user_is_in_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		if (string.equals("Queue"))
		{			
			queue_PF.ClickQueue();
		}
		else
		{
			queue_PF.ClickQueue();
			queue_PF.ClickText(string);			
		}
	}

	@When("The user click {string} link for Queue")
	public void the_user_click_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("Practice Questions"))
		{			
			queue_PF.ClickQueueOP();
		}
		queue_PF.ClickText(string);		
	}

	@Then("The user should be redirected to {string} Page for Queue")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();		
		Assert.assertEquals(string, msg);
		logger.info("User is in the " + string + " Page");
	}

	@Given("The user is in the tryEditor page in {string} page for Queue")
	public void the_queue_user_is_in_the_try_editor_page(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickQueue();		
		queue_PF.ClickText(string);
		queue_PF.ClickTryEditor();		
	}

	@Then("The user should able to see an error message in alert window for Queue")
	public void the_queue_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = queue_PF.AlertMsg();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
		logger.info(alertMsg);
		queue_PF.Alertaccept();		
	}
	
	@Then("The user should able to see output in the console for Queue")
	public void the_queue_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals(expectedOutput, queue_PF.getOPMsg());
		logger.info(expectedOutput);
	}
		
	@Then("The user should be redirected to a page having an {string} Page for Queue")
	public void the_user_should_be_redirected_to_a_page_having_an_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();
		Assert.assertEquals("Assessment", msg);
	}
	
	@When("The user click {string} button for Queue")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickTryEditor();
	}
		
	@When("User enters data from Excel {string} and {int} for Queue")
    public void user_enters_data_from_excel(String SheetName, Integer RowNo) throws IOException {      
		List<Object[]> editorData = ExcelReader.readExcelData(SheetName);       
        if (RowNo <= editorData.size()) 
        { 
        	Object[] row = editorData.get(RowNo-1); // Access the desired row directly
       		inputText = (String) row[0];
       	    expectedOutput = (String) row[1];         
       	    performEditorTest(inputText, expectedOutput);
        }
    }   

    private void performEditorTest(String inputText, String expectedOutput){
        //Implementation of the textbox editor test.
    	queue_PF.PythonCode(inputText);        
		queue_PF.ClickBtnRun();		
    }
	
}
