package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsAlgo_PageObjects.Queue;
import dsAlgo_Utilities.ExcelReader;

public class Queue_SD{
	
	public Queue queue_PF;
	String inputText;
	String expectedOutput;
		
	public Queue_SD() { 
        queue_PF = new Queue();
    }
	
	@Given("Queue User Launches DsAlgo portal")
	public void queue_user_launches_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
		queue_PF.openLogin();
		queue_PF.SetUserName("bugbusters");
		queue_PF.SetPassword("Team@bug");
		queue_PF.ClickBtnLogin();		 
	}
	
	@Given("The Queue user is in the Main page after Sign in")
	public void the_queue_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The Queue user clicks the {string} button in Queue")
	public void the_user_clicks_the_button_in_queue(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickQueue();
	}

	@Then("The Queue user should land in {string}")
	public void the_user_should_land_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();
		Assert.assertEquals(string, msg);
	}

	@Given("The Queue user is in the {string} page")
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

	@When("The Queue user click {string} link")
	public void the_user_click_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("Practice Questions"))
		{			
			queue_PF.ClickQueueOP();
		}
		queue_PF.ClickText(string);		
	}

	@Then("The Queue user should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();		
		Assert.assertEquals(string, msg);
	}

	@Given("The Queue user is in the tryEditor page in {string} page")
	public void the_queue_user_is_in_the_try_editor_page(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickQueue();		
		queue_PF.ClickText(string);
		queue_PF.ClickTryEditor();		
	}

	@When("The Queue user write the invalid code in Editor and click the Run Button")
	public void the_queue_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		queue_PF.PythonCode("Hello");        
        queue_PF.ClickBtnRun();        
	}

	@Then("The Queue user should able to see an error message in alert window")
	public void the_queue_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = queue_PF.AlertMsg();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
		queue_PF.Alertaccept();
	}
	
	@When("The Queue user write the valid code in Editor and click the Run Button")
	public void the_queue_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		queue_PF.PythonCode("print(\"Hello\")");        
		queue_PF.ClickBtnRun();
	}

	@Then("The Queue user should able to see output in the console")
	public void the_queue_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals("Hello", queue_PF.getOPMsg());
	}
	
	
	
	@Then("The Queue user should be redirected to a page having an {string} Page")
	public void the_user_should_be_redirected_to_a_page_having_an_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = queue_PF.getTitle();
		Assert.assertEquals("Assessment", msg);
	}
	
	@When("The Queue user click {string} button")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		queue_PF.ClickTryEditor();
	}
	
	@When("The Queue user clicks the Run Button without entering the code in the Editor")
	public void the_queue_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		queue_PF.PythonCode("");        
		queue_PF.ClickBtnRun();
	}
	
	@When("Queue User enters data from Excel {string} in {string}")
    public void user_enters_data_from_excel(String SheetName, String Page) throws IOException {      
        List<Object[]> editorData = ExcelReader.readExcelData(SheetName);
        for (Object[] row : editorData) { 
       		inputText = (String) row[0];
       	    expectedOutput = (String) row[1];         
       	    performEditorTest(inputText, expectedOutput, Page);
        }
    }

    @Then("The Queue editor should display Expected Text")
    public void the_editor_should_display() {
        // Assert the expected output
    	
    }

    private void performEditorTest(String inputText, String expectedOutput, String Page){
        //Implementation of the textbox editor test.
    	queue_PF.PythonCode(inputText);        
		queue_PF.ClickBtnRun();
		
		if (expectedOutput.equals("AlertMessage"))
	   	{
	    	String alertMsg = queue_PF.AlertMsg();
			Assert.assertTrue(alertMsg.contains("NameError:"));	   
			queue_PF.Alertaccept();
	   	}
    	else
    	{
	    	Assert.assertEquals(expectedOutput, queue_PF.getOPMsg());
	   	}
		
		queue_PF.openHome();
		queue_PF = new Queue();
		the_queue_user_is_in_the_try_editor_page(Page);
    }
	
}
